package servicio;

import practicathreads.Banco;

public class BancoServicio implements Runnable{

    private Banco banco;
    private int cuentaOrigen;
    private double cantidadMax;
    public BancoServicio(int cuentaOrigen, double cantidadMax){
        this.banco = new Banco();
        this.cuentaOrigen = cuentaOrigen;
        this.cantidadMax = cantidadMax;
    }
    @Override
    public void run() {
        try{
            //Buble infinito de transferencias
            while(true){
                int cuentaDestino = (int) (Math.random() * 100);
                double cantidad = Math.random() * cantidadMax;
                banco.transferencia(cuentaOrigen, cuentaDestino, cantidad);
                //Dormir hilos
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
