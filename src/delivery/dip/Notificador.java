package delivery.dip;

// DIP: abstração usada pelo sistema.
// ISP: também é a interface específica de envio de notificações.
public interface Notificador {
    void enviar(String mensagem);
}
