package delivery.dip;

// DIP: depende da interface Notificador, não de Email, SMS ou WhatsApp.
public class ServicoNotificacao {
    private final Notificador notificador;

    public ServicoNotificacao(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificar(String mensagem) {
        notificador.enviar(mensagem);
    }
}
