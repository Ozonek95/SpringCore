package zadanieCzwarteAOP.pakiet_trzy;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * TODO: Stwórz aspekt, który zmierzy czas wykonywania metody z klasy RepositoryImpl.
 *  Ta klasa powinna mieć logger, który będzie wypisywał na konsolę jaka metoda została wykonana
 *  i ile czasu zajęło jej wykonanie.
 *  Wykorzystaj @Around.
 *  Staraj się nie zaglądać do przykładu. Stwórz rozwiązanie sam, ewentualnie posiłkuj się tym
 *  tutorialem:
 *
 *  - https://howtodoinjava.com/spring-aop/aspectj-around-annotation-example/
 *
 * @author Kacper Staszek
 */
@Aspect
@Component
class WydajnośćAspekt {
  private Logger logger = Logger.getLogger(getClass().getName());

  @Pointcut("within(zadanieCzwarteAOP.pakiet_trzy.*)")
  void metodyRepository(){}

  @Around("metodyRepository()")
  public Object zmierzCzasWykonywaniaMetod(ProceedingJoinPoint joinPoint) {
    long start = System.nanoTime();
    Object zwróconyPrzezMetodę = null;
    try {
      zwróconyPrzezMetodę = joinPoint.proceed();
    } catch (Throwable throwable) {
      System.err.println(throwable.getMessage());
    }
    long end = System.nanoTime();
    String methodName = joinPoint.getSignature().getName();
    logger.info("Wykonanie metody "+methodName+" zajęło "+ TimeUnit.NANOSECONDS.toMillis(end-start)+"ms.");
    return zwróconyPrzezMetodę;
  }

}
