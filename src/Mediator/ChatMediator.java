package Mediator;

public interface ChatMediator {
    void enviarMensaje(String mensaje, User emisor);
    void registrarUsuario(User user);
}
