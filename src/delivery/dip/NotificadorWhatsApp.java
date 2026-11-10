package delivery.dip;

public class NotificadorWhatsApp implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[WhatsApp] " + mensagem);
    }
}
