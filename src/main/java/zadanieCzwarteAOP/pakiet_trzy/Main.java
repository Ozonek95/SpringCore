package zadanieCzwarteAOP.pakiet_trzy;

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
    ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    context.getBean(Repository.class).repoMethod();
  }
}
