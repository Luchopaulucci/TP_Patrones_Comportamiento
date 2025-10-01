package Template;

public class ReporteCurso extends ReporteAcademico {
    private String nombreCurso;
    private int cantidadAlumnos;
    private double promedioNotas;

    public ReporteCurso(String nombreCurso, int cantidadAlumnos, double promedioNotas) {
        this.nombreCurso = nombreCurso;
        this.cantidadAlumnos = cantidadAlumnos;
        this.promedioNotas = promedioNotas;
    }

    @Override
    protected void generarContenido() {
        System.out.println("Curso: " + nombreCurso);
        System.out.println("Cantidad de alumnos: " + cantidadAlumnos);
        System.out.println("Promedio de notas: " + promedioNotas);
    }
}
