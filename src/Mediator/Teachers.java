package Mediator;

public class Teachers extends User {
    public Teachers(ChatMediator mediator, String nombre) {
        super(mediator, nombre);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("[Teacher] " + nombre + " envía: " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje, User emisor) {
        System.out.println("[Teacher] " + nombre + " recibe de " + emisor.getNombre() + ": " + mensaje);
    }
}

