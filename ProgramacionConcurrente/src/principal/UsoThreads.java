package principal;

import practicathreads.VariosHilosDos;
import practicathreads.VariosHilosUno;
import servicio.BancoServicio;

public class UsoThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            BancoServicio ejecutarTransferencias = new BancoServicio(i, 2000);
            Thread hilo = new Thread(ejecutarTransferencias);
            hilo.start();
        }
//-------------Sincronizando-Hilos-----------------------------------------------------------------
        VariosHilosUno hUno = new VariosHilosUno();
        VariosHilosDos hDos = new VariosHilosDos(hUno);
        hUno.start();
        hDos.start();
    }
}
