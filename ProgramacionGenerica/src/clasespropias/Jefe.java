package clasespropias;

public class Jefe extends Empleado{
    private double incentivo;

    public Jefe(double incentivo) {
        this.incentivo = incentivo;
    }

    public Jefe(String nombre, int edad, double salario) {
        super(nombre, edad, salario);
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }
}
