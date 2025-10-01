package Template;

// ReporteAcademico.java
public abstract class ReporteAcademico {

    // Template Method: define la estructura del algoritmo
    public final void generarReporte() {
        generarEncabezado();
        generarContenido(); // Paso variable (implementado por subclases)
        generarPie();
    }

    // Pasos comunes (implementados en la clase abstracta)
    private void generarEncabezado() {
        System.out.println("=== REPORTE ACADÉMICO ===");
        System.out.println("Fecha: " + java.time.LocalDate.now());
        System.out.println("--------------------------");
    }

    private void generarPie() {
        System.out.println("--------------------------");
        System.out.println("Fin del reporte. © Facultad 2025");
    }

    // Paso variable (debe ser implementado por subclases)
    protected abstract void generarContenido();
}

