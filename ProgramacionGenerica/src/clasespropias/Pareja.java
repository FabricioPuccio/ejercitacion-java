package clasespropias;
//<T> Indicamos que esta clase es genérica, por convención se utilizan las letras T, U y K mayúsculas
public class Pareja <T>{

    private T primero;
    public Pareja(){
        this.primero = null;
    }

    public T getPrimero() {
        return primero;
    }

    public void setPrimero(T primero) {
        this.primero = primero;
    }
    /*
    Tipos comodin:
    Este método puede recibir un objeto de tipo Empleado o que herede de Empleado
     */
    public static String imprimeDatos(Pareja<? extends Empleado> e){
        return e.toString();
    }

    @Override
    public String toString() {
        return "\nPareja: " +
                "primero=" + primero;
    }
}
