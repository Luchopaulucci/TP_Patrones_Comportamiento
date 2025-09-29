package MementoPatron;

public class Examen {
    private String respuestas; //es el estado actual del examen

    public void responder(String respuestas){
        this.respuestas = respuestas;
    }
    public String getRespuestas(){
        return respuestas;
    }
    // guarda el estado actual en un memento
    public Memento save(){
        return new Memento(respuestas);
    }
    //restaura el estado desde el patron memento
    public void restore(Memento m) {
        this.respuestas = m.getRespuestas();

    }
}
