package zadanie_cztery_AOP.c_around_aspekt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Zapoznamy się z bardzo ciekawym aspektem - @Around. Przejdź do klasy AroundAspekt.
 * @author Kacper Staszek
 */
@ComponentScan
@EnableAspectJAutoProxy
class Main {

  public static void main(String[] args) {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(Main.class);
    kontekst.getBean(Repozytorium.class).metodaRepozytorium();
  }
}
