package patron.aop.singleton;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class SingletonAspect {

    // Aquí guardamos la instancia en memoria
    private AOPLoggerCentral instancia = null;

    // Interceptamos la llamada al constructor (el 'new')
    @Around("call(patron.aop.singleton.AOPLoggerCentral.new(..))")
    public Object asegurarSingleton(ProceedingJoinPoint pjp) throws Throwable {
        if (instancia == null) {
            System.out.println("[Aspecto] Creando la instancia por primera vez...");
            instancia = (AOPLoggerCentral) pjp.proceed(); // Deja que el new se ejecute
        } else {
            System.out.println("[Aspecto] Bloqueando el new. Devolviendo instancia existente...");
        }
        return instancia;
    }
}