package Strategy;
import java.util.List;

public class ExamenExtra implements CalculoNota{
    @Override
    public Integer calcular(List<Integer> notas) {
        Integer promedio = 0;
        int notaExtra =10;
        for(Integer n : notas){
            promedio +=n;
        }
        promedio += notaExtra;
        System.out.println("Con examen extra ___ en el cual notaExtra: "+notaExtra);
        return (promedio/(notas.size()+1));
    }
}
