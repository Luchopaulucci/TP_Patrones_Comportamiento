package Visitor;

public class AlumnoBecado implements Alumnoo {
    private String nombre;
    private double cuotaMensual;
    private double porcentajeBeca;

    public AlumnoBecado(String nombre, double cuotaMensual, double porcentajeBeca) {
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.porcentajeBeca = porcentajeBeca;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    @Override
    public void aceptar(Visitor visitor) {
        visitor.visitar(this);
    }
}
