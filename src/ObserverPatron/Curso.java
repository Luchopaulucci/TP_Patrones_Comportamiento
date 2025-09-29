package ObserverPatron;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nombre;
    private List<Observer> observadores = new ArrayList<>();

    public Curso(String nombre){
        this.nombre = nombre;
    }
    public void agregarObservador (Observer o){
        observadores.add(o);
    }
    public void eliminarObservador(Observer o){
        observadores.remove(o);
    }
    public void notificar(String mensaje){
        for (Observer o : observadores){
            o.update("[" + nombre + "]" + mensaje);

        }
    }
    //ejemplo de cambio en el curso
    public void cambiarHorarios(String nuevoHorario){
        //alg para cambiar de horario
        notificar("El horario cambio a: "+ nuevoHorario);
    }
}
