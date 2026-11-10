package delivery.dip;

public class NotificadorSms implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[Sms] " + mensagem);
    }
}
