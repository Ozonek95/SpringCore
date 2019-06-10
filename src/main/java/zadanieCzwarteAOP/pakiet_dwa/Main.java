package zadanieCzwarteAOP.pakiet_dwa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import zadanieCzwarteAOP.pakiet_dwa.człowieki.Człowiek;
import zadanieCzwarteAOP.pakiet_dwa.zwierzaki.Kot;
import zadanieCzwarteAOP.pakiet_dwa.zwierzaki.Pies;

/**
 * @author Kacper Staszek
 */
@ComponentScan
@EnableAspectJAutoProxy
class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    Człowiek człowiek = context.getBean(Człowiek.class);
    Pies pies = context.getBean(Pies.class);
    Kot kot = context.getBean(Kot.class);

    człowiek.setZawódWykonywany("Stolarz");

    pies.setImie("Burek");

    kot.setImie("Mruczek");

    człowiek.getZawódWykonywany();
  }
}
