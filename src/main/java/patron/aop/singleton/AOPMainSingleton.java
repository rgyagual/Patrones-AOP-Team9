package patron.aop.singleton;

public class AOPMainSingleton {
    public static void main(String[] args) {
        System.out.println("Intentando crear Logger 1...");
        // El aspecto lo va a interceptar al new
        AOPLoggerCentral logger1 = new AOPLoggerCentral();
        logger1.registrarLog("Iniciando sistema con AOP...");

        System.out.println("\nIntentando crear Logger 2...");
        AOPLoggerCentral logger2 = new AOPLoggerCentral();
        logger2.registrarLog("Procesando datos...");

        System.out.println("\n--- RESULTADO AOP ---");
        System.out.println("¿logger1 y logger2 comparten la misma memoria?: " + (logger1 == logger2));
    }

    }