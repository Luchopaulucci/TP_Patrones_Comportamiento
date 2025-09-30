package Mediator;

public abstract class User {
    protected final ChatMediator mediator;
    protected final String nombre;

    public User(ChatMediator mediator, String nombre) {
        this.mediator = mediator;
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje, User emisor);
}

