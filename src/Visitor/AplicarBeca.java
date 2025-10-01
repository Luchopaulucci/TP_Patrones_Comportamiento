package Visitor;

// AplicarBeca.java
public class AplicarBeca implements Visitor {

    @Override
    public void visitar(AlumnoRegular alumno) {
        // A los regulares se les aplica un 10% de descuento por puntualidad
        double descuento = alumno.getCuotaMensual() * 0.10;
        System.out.printf(
                "%s (Regular): Cuota original $%.2f, Descuento $%.2f, Total a pagar $%.2f%n",
                alumno.getNombre(),
                alumno.getCuotaMensual(),
                descuento,
                alumno.getCuotaMensual() - descuento
        );
    }

    @Override
    public void visitar(AlumnoBecado alumno) {
        // A los becados se les aplica su porcentaje de beca
        double beneficio = alumno.getCuotaMensual() * (alumno.getPorcentajeBeca() / 100);
        System.out.printf(
                "%s (Becado): Cuota original $%.2f, Beca $%.2f (%.1f%%), Total a pagar $%.2f%n",
                alumno.getNombre(),
                alumno.getCuotaMensual(),
                beneficio,
                alumno.getPorcentajeBeca(),
                alumno.getCuotaMensual() - beneficio
        );
    }
}
