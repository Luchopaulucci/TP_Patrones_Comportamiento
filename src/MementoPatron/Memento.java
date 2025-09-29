package MementoPatron;
/*memento guarda el estado del examen*/
public class Memento {
    private final String respuestas;

    public Memento(String respuestas){
        this.respuestas = respuestas;
    }
    public String getRespuestas() {
        return respuestas;
    }
}
