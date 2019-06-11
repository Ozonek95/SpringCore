package zadanieCzwarteAOP.pakiet_cztery.serwisy;

import java.util.Arrays;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Aspect
@Component
class LogującyAspekt {

  private Logger logger;

  @Autowired
  LogującyAspekt(Logger logger) {
    this.logger = logger;
  }

  @Around("@annotation(Loggable)")
  Object loguj(ProceedingJoinPoint proceedingJoinPoint){

    Object[] argumentyPrzekazaneDoWywoływanejMetody = proceedingJoinPoint.getArgs();
    Object target = proceedingJoinPoint.getTarget();

    Object toReturn = null;
    try {
      toReturn = proceedingJoinPoint.proceed();
    } catch (Throwable throwable) {
      System.err.println(throwable.getMessage());
    }

    logger.loguj("Metoda :"+proceedingJoinPoint.getSignature().toShortString()+"wywołana na obiekcie: "+target+" z przekazanymi argumentami :"+ Arrays
        .toString(argumentyPrzekazaneDoWywoływanejMetody)+" zwróciła "+toReturn);

    return toReturn;
  }
}
