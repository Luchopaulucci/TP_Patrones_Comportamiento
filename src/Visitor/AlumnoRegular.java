package Visitor;

public class AlumnoRegular implements Alumnoo {
    private String nombre;
    private double cuotaMensual;

    public AlumnoRegular(String nombre, double cuotaMensual) {
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}
