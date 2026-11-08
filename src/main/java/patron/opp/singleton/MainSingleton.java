package patron.opp.singleton;

// Clase creada para ilustrar el funcionamiento del Singleton en OOP
public class MainSingleton {
    public static void main(String[] args) {
        // Obtenemos el logger por primera vez
        LoggerCentral logger1 = LoggerCentral.getInstance();
        logger1.registrarLog("Iniciando el sistema de monitoreo...");

        // Simulamos que otra parte del sistema pide el logger
        LoggerCentral logger2 = LoggerCentral.getInstance();
        logger2.registrarLog("Alerta de temperatura alta detectada.");

        //Comprobamos si son exactamente el mismo objeto en memoria
        System.out.println("¿logger1 y logger2 son el mismo objeto? " + (logger1 == logger2));
    }
}