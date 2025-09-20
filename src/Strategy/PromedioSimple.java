package Strategy;

import java.util.List;

public class PromedioSimple implements CalculoNota{
    public Integer calcular(List<Integer> notas) {
        Integer promedio = 0;
        for(Integer n : notas){
            promedio +=n;
        }
        System.out.println("Con promedio simple___");
        return (promedio/notas.size());
    }
}
