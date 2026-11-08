package patron.aop.singleton;


public class AOPLoggerCentral {
    // Constructor público
    public AOPLoggerCentral() {
        System.out.println("AOPLoggerCentral: Construyendo objeto en memoria...");
    }

    public void registrarLog(String mensaje) {
        System.out.println("[LOG AOP]: " + mensaje);
    }
    
}
