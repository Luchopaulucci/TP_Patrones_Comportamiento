package MementoPatron;

public class AlumnoExamenCareTaker {
    private Memento MementoPatron;

    public void guardarProgreso(Memento m){
        this.MementoPatron = m;
    }

    public Memento obtenerProgreso(){
        return MementoPatron;
    }
}
