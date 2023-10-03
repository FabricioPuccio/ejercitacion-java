package practicathreads;

public class Banco {

    private final double[] cuentas;

    public Banco() {
        cuentas = new double[200];
        for (int i = 0; i < cuentas.length; i++) {
            cuentas[i] = 200;
        }
    }

    /**
     * Método que se encarga de hacer transferencias entre cuentas.
     * Para indicar que queremos que este método este sincronizado debemos agregar
     * la palabra clave synchronized.
     */
    public synchronized void transferencia(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException {

        //Mientras que la condición sea true el hilo espera
        while (cuentas[cuentaOrigen] < cantidad) {
            /*Solo podemos utilizar los métodos wait() y notifyAll() de la clase Object
            cuando nuestro programa evalúe una sola condición*/
            wait();

        }

        System.out.println("\n\nHilo nombre: " + Thread.currentThread() + "\n");
        cuentas[cuentaOrigen] -= cantidad;
        System.out.printf("%10.2f desde la cuenta: %d para la cuenta: %d", cantidad, cuentaOrigen, cuentaDestino);

        notifyAll();
    }

    public double saldoTotal() {
        double saldo = 0;
        for (double s :
                cuentas) {
            saldo += s;
        }
        return saldo;
    }

}
