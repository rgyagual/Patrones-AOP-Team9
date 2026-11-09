package patron.oop.singleton;


public class LoggerCentral {
    // 1. El atributo estático que guardará la  instancia
    private static LoggerCentral instancia;

    // 2. El constructor privado
    private LoggerCentral() {
        System.out.println("LoggerCentral inicializado");
    }

    // 3. El método de acceso global
    public static LoggerCentral getInstance() {
        if (instancia == null) {
            instancia = new LoggerCentral();
        }
        return instancia;
    }
    // 4. La lógica
    public void registrarLog(String mensaje) {
        System.out.println("[LOG]: " + mensaje);
    }
}
