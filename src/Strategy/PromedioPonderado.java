package Strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PromedioPonderado implements CalculoNota{
    @Override
    public Integer calcular(List<Integer> notas) {
        float sumaPonderacion=0;
        float promedio = 0;
        int contador = 0;
        ArrayList<Float> ponderacion = new ArrayList<>(Arrays.asList(0.3f,0.5f,0.8f,0.3f));
        ArrayList<Float> resultado = new ArrayList<>();

        //Hacemos las multiplicacion y suma de cada nota con su ponderado y lo ponemos en un array
        //Tambien sacamos la suma de todos los porcentajes de los ponderados
        for (Float porcentaje : ponderacion){
            sumaPonderacion+=porcentaje;
            resultado.add(porcentaje*notas.get(contador));
            contador++;
        }

        //Sacamos el promedio ponderado
        for(Float n : resultado){
            promedio+=n;
        }
        System.out.println("Con promedio ponderado___ donde _Matematicas 30% _Lengua 50% _Física %80 _Ciencias: 30%");
        return (int) (promedio/sumaPonderacion);
    }
}
