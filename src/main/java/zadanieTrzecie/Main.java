package zadanieTrzecie;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

/**
 *  TODO:
 *    Spring używa wzorca Obserwator do wyzwalania akcji przy różnych zdarzeniach w ApplicationContext.
 *    Twoim zadaniem jest stworzenie trzech takich zdarzeń. Niech na przykład drukują coś na konsolę.
 *
 * @author Kacper Staszek
 */
@ComponentScan
class Main {
  public static void main(String[] args) {
    AbstractApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    context.start();
    context.stop();
    context.start();
    context.close();
  }
}
