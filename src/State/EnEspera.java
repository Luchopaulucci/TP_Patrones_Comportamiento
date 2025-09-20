package State;

public class EnEspera implements EstadoInscripcion{
    public void cambiarEstado(Inscripcion ins){
        System.out.println("Iniciando Inscripción...                    En estado Inscripto..");
        ins.setEstado(new Inscripto());
    }
}
