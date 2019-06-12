package zadanie_cztery_AOP.pakiet_trzy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Adnotacja @Around może dokonać pewnych akcji przed i po wykonaniu metody.
 * Zwraca obiekt, który zwróci wywoływana w nim metoda. W przypadku void będzie to null.
 * Metoda aspektu MUSI posiadać argument ProceedingJoinPoint. Inaczej nie będziemy w stanie
 * uruchomić wywoływanej metody.
 *
 * TODO: Uruchom program, prześledź kod.
 *  Po zapoznaniu się z działaniem przejdź do klasy WydajnośćAspekt.
 *
 * @author Kacper Staszek
 */
@Aspect
@Component
class AroundAspekt {

  @Pointcut("within(zadanie_cztery_AOP.pakiet_trzy.*)")
  void metodyRepository(){}

  @Around("metodyRepository()")
  Object aroundAspekt(ProceedingJoinPoint proceedingJoinPoint){

    //odpowiednik @Before
    System.out.println("Przed wykonaniem metody");

    Object zwracanyPrzezWywołanąMetodę = null;

    try {
      //KONIECZNE DO WYKONANIA METODY! JEŻELI TEGO NIE NAPISZEMY, METODA SIĘ NIE WYKONA!!
      zwracanyPrzezWywołanąMetodę = proceedingJoinPoint.proceed();
      //Odpowiednik @After
      System.out.println("Po zakończeniu metody");
    } catch (Throwable throwable) {
      System.err.println(throwable.getMessage());
    }
    return zwracanyPrzezWywołanąMetodę;
  }
}
