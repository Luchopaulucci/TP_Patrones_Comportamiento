package State;

public class Inscripto implements EstadoInscripcion{
    @Override
    public void cambiarEstado(Inscripcion ins) {
        System.out.println("Se esta dando de baja...                    En estado Cancelado..");
        ins.setEstado(new Cancelado());
    }
}
