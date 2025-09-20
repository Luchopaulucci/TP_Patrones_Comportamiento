package Strategy;

import java.util.List;

public class Student {
    private CalculoNota calculoNota;
    private int notaextra;
    public Student(CalculoNota calculoNota){
        this.calculoNota = calculoNota;
    }

    public void setCalculoNota(CalculoNota calculoNota) {
        this.calculoNota = calculoNota;
    }

    public void promedio (List<Integer> notas){
        System.out.println("La nota es : "+calculoNota.calcular(notas));
    }
}
