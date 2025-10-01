package Template;

public class ReporteAlumno extends ReporteAcademico {
    private String nombreAlumno;
    private String curso;
    private double notaFinal;

    public ReporteAlumno(String nombreAlumno, String curso, double notaFinal) {
        this.nombreAlumno = nombreAlumno;
        this.curso = curso;
        this.notaFinal = notaFinal;
    }

    @Override
    protected void generarContenido() {
        System.out.println("Alumno: " + nombreAlumno);
        System.out.println("Curso: " + curso);
        System.out.println("Nota final: " + notaFinal);
    }
}

