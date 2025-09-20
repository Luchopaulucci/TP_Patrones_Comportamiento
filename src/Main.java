import ChainResponsability.*;
import Command.*;
import State.*;
import Strategy.*;

import java.util.ArrayList;
import java.util.Arrays;

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

        System.out.println("\n----------Prueba patron Strategy----------");
        //Se crea un alumno con un promedio simple a sacar
        Student student = new Student(new PromedioSimple());
        ArrayList <Integer> notas = new ArrayList<>(Arrays.asList(1,4,9,9));
        System.out.println("Notas del Alumno\n_Matematicas: 1\n_Lengua: 4\n_Física: 9\n_Ciencias: 9");
        student.promedio(notas);

        //Se crea un alumno con un promedio ponderado a sacar
        student.setCalculoNota(new PromedioPonderado());
        student.promedio(notas);

        //Se crea un alumno con un examen extra a sacar
        student.setCalculoNota(new ExamenExtra());
        student.promedio(notas);
    }
}