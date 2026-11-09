package patron.oop.adapter;

public class ServicioSMS {
    public void enviarSMS(String numero, String texto) {
        System.out.println("[SMS] Destinatario: " + numero);
        System.out.println("[SMS] Mensaje: " + texto);
    }
}
