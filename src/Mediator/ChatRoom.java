package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private final List<User> users = new ArrayList<>();

    @Override
    public void registrarUsuario(User user) {
        users.add(user);
    }

    @Override
    public void enviarMensaje(String mensaje, User emisor) {
        for (User u : users) {
            if (u != emisor) { // no se reenvía a sí mismo
                u.recibir(mensaje, emisor);
            }
        }
    }
}

