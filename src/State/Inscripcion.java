package State;

public class Inscripcion  {
    private EstadoInscripcion estado;

    //Se le da el estado inicial que el alumno tendra
    public Inscripcion () {
        System.out.println("Esperando a realizar inscripcion...         En estado Espera..");
        estado = new EnEspera();
    }

    public void setEstado(EstadoInscripcion estado) {
        this.estado = estado;
    }

    public void cambiarEstado() {estado.cambiarEstado(this);}

}
