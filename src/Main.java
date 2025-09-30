import ChainResponsability.*;
import Command.*;
import State.*;
import Strategy.*;
import MementoPatron.*;
import ObserverPatron.*;
import Iterator.*;
import Mediator.*;


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

        //APLICO PATRON MEMENTO--------------------

        System.out.println("\n----------Prueba patron Memento---------------");

        Examen examen = new Examen();
        examen.responder("Pregunta1: A; Pregunta2: B");
        System.out.println("Respuestas actuales: " + examen.getRespuestas());

        AlumnoExamenCareTaker careTaker = new AlumnoExamenCareTaker();
        careTaker.guardarProgreso(examen.save());

        examen.responder("Pregunta1: C; Pregunta2: D");
        System.out.println("Respuestas modificadas: " + examen.getRespuestas());

        examen.restore(careTaker.obtenerProgreso());
        System.out.println("Respuestas restauradas: " + examen.getRespuestas());


        // PATRON OBSERVER

        System.out.println("\n------------ Prueba de patron Observer-----------");

        Curso curso = new Curso("Programacion II");
        AlumnoObserver a1 = new AlumnoObserver("Belen ");
        AlumnoObserver a2 = new AlumnoObserver("Fran ");

        curso.agregarObservador(a1);
        curso.agregarObservador(a2);

        curso.cambiarHorarios("Lunes 10:00hs");
        curso.notificar("Nuevo aviso: Parcial el 25 de Octubre");

        System.out.println("\n------------ Prueba de patron Iterator-----------");

        StudentCourse studentCourse = new StudentCourse("Franco Dagostino");

        studentCourse.enroll(new Course("AN101", "Analisis I"));
        studentCourse.enroll(new Course("SD101",  "Desarrollo de Software"));
        studentCourse.enroll(new Course("DB201",  "Bases de datos"));

        CourseIterator it = studentCourse.iterator();
        System.out.println("Cursos " + studentCourse.getName() + ":");
        while (it.hasNext()) {
            Course c = it.next();
            System.out.println(" - " + c.getCode() + " - " + c.getName());
        }

        System.out.println("\n------------ Prueba de patron Mediator-----------");

        ChatMediator chat = new ChatRoom();

        User s1 = new Students(chat, "Franco");
        User s2 = new Students(chat, "Rossi");
        User t1 = new Teachers(chat, "Ing. López");

        chat.registrarUsuario(s1);
        chat.registrarUsuario(s2);
        chat.registrarUsuario(t1);

        s1.enviar("Profe, ¿la consigna del TP usa Iterator y Mediator?");
        t1.enviar("Sí, y recuerden subir el código con un README.");
        s2.enviar("¡Gracias, profe!");

    }
}