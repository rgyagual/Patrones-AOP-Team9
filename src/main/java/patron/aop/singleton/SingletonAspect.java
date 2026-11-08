package patron.aop.singleton;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SingletonAspect {

    // Se ejecutará antes de cualquier método dentro de AOPLoggerCentral
    @Before("execution(* patron.aop.singleton.AOPLoggerCentral.*(..))")
    public void interceptar() {
        System.out.println("[Aspecto] Interceptando llamada al Singleton...");
    }
}