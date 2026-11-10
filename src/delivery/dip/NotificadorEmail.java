package delivery.dip;

public class NotificadorEmail implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[Email] " + mensagem);
    }
}
