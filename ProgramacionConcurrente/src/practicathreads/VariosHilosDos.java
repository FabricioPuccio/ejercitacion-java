package practicathreads;

public class VariosHilosDos extends Thread {
    private Thread hilo;

    public VariosHilosDos(Thread hilo) {
        this.hilo = hilo;
    }

    @Override
    public void run() {
        super.run();
        /*Utilizamos el método join() para decirle al programa que el
         * método run() arranque cuando el hilo que obtenemos por parámetro
         * haya finalizado su ejecución.*/
        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 15; i++) {

            System.out.println("Ejecutando hilo" + getName());

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}
