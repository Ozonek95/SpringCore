package zadania_cztery_AOP.pakiet_dwa.aspekty;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * TODO: Poniżej zdefiniowałem Pointcuty. Ich nazwy wskazują, do jakich metod ma zostać zastosowany aspekt.
 *  pointcutów używamy, żeby zgromadzic w jedno miejsce wyrażenia określające join pointy naszych aspektów.
 *  następnie używamy ich jak poniżej tj: @Before("nazwaMetodyPointcut()")
 *  Twoim zadaniem jest napisać wszystkie pointcuty tak, żeby zadziałały z chcianymi metodami.
 *  Postępuj zgodnie ze schematem:
 *  1. Napisz pointcut.
 *  2. Przeklej nazwę metody pointcut do @Before nad metodą uruchamiamPrzed(JoinPoint joinPoint).
 *  3. Uruchom aplikację i zobacz, czy zadziała.
 *  4. Powtarzaj aż wszystkie Pointcuty będą działały prawidłowo.
 *
 * - https://howtodoinjava.com/spring-aop/aspectj-pointcut-expressions/
 *
 * @author Kacper Staszek
 */
@Aspect
@Component
class PrzykładowyAspekt {

  @Before("getterPsa()")
  void uruchamiamPrzed(JoinPoint joinPoint){
    System.out.println("Uruchomione przed "+joinPoint);
  }

  @Pointcut()
  void zwierzaki() {
  }

  @Pointcut()
  void samochody(){
  }

  @Pointcut()
  void człowieki() {
  }

  @Pointcut()
  void całyPakiet(){
  }

  @Pointcut()
  void żyweIstoty(){
  }

  @Pointcut()
  void setterySamochodów(){}

  @Pointcut()
  void getterPsa(){}
}

