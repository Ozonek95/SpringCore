package zadania_cztery_AOP.c_around_aspekt;

import java.util.logging.Logger;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * TODO: Stwórz aspekt, który zmierzy czas wykonywania metody z klasy RepozytoriumImpl.
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
  private Logger logger = null;

}
