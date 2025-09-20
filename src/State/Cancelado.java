package State;

public class Cancelado implements EstadoInscripcion{
    public void cambiarEstado(Inscripcion ins) {
        System.out.println("Ahora estas inscripto de nuevo...           En estado Inscripto..");
        ins.setEstado(new Inscripto());
    }
}
