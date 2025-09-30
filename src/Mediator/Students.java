package Mediator;

public class Students extends User {
    public Students(ChatMediator mediator, String nombre) {
        super(mediator, nombre);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("[Student] " + nombre + " envía: " + mensaje);
        mediator.enviarMensaje(mensaje, this);
    }

    @Override
    public void recibir(String mensaje, User emisor) {
        System.out.println("[Student] " + nombre + " recibe de " + emisor.getNombre() + ": " + mensaje);
    }
}

