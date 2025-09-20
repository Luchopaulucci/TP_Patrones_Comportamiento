import ChainResponsability.*;
import Command.*;
import State.Inscripcion;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n----------Prueba patron Chain Responsability----------");
        HandlerTutorias basico = new RevisionAsistente();
        HandlerTutorias intermedio = new RevisionCoordinador();
        HandlerTutorias experto = new RevisionProfesor();
        basico.setNext(intermedio);
        intermedio.setNext(experto);
        basico.handle("consulta simple", 1);
        basico.handle("consulta compleja", 3);

        System.out.println("\n----------Prueba patron Chain Responsability----------");
        Alumno alumno = new Alumno();
        Command inscribirse = new InscribirseCursoCommand(alumno);
        Command abandonar = new AbandonarCursoCommand(alumno);
        Command solicitarCertificado = new SolicitarCertificadoCommand(alumno);
        Invoker remote = new Invoker();
        remote.setCommand(inscribirse);
        remote.ejecutar();
        remote.setCommand(abandonar);
        remote.ejecutar();
        remote.setCommand(solicitarCertificado);
        remote.ejecutar();

        System.out.println("\n----------Prueba patron State----------");

        Inscripcion inscripcion = new Inscripcion();

        inscripcion.cambiarEstado();
        inscripcion.cambiarEstado();
        inscripcion.cambiarEstado();

    }
}