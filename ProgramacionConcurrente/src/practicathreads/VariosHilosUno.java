package practicathreads;

public class VariosHilosUno extends Thread{
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 15; i++) {
            /*Utilizamos el método getName() que heredamos de la clase Thread
            * para obtener y visualizar el nombre que la Máquina Virtual de Java
            * la da a el hilo que se ejecuta.*/
            System.out.println("Ejecutando hilo: " + getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}
