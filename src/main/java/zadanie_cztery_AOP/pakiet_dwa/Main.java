package zadanie_cztery_AOP.pakiet_dwa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import zadanie_cztery_AOP.pakiet_dwa.człowieki.Człowiek;
import zadanie_cztery_AOP.pakiet_dwa.samochody.Osobówka;
import zadanie_cztery_AOP.pakiet_dwa.samochody.Tir;
import zadanie_cztery_AOP.pakiet_dwa.zwierzaki.Kot;
import zadanie_cztery_AOP.pakiet_dwa.zwierzaki.Pies;

/**
 * Poćwiczymy trochę tworzenie pointcut expression i dowiemy się czym jest @Pointcut.
 *
 * TODO:Przejdź do klasy aspekty.PrzykładowyAspekt i postępuj zgodnie z instrukcją.
 *
 * @author Kacper Staszek
 */
@ComponentScan
@EnableAspectJAutoProxy
class Main {

  public static void main(String[] args) {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(Main.class);
    Człowiek człowiek = kontekst.getBean(Człowiek.class);
    Pies pies = kontekst.getBean(Pies.class);
    Kot kot = kontekst.getBean(Kot.class);
    Tir tir = kontekst.getBean(Tir.class);
    Osobówka osobówka = kontekst.getBean(Osobówka.class);

    człowiek.setZawódWykonywany("Stolarz");

    pies.setImie("Burek");

    pies.getImie();

    kot.setImie("Mruczek");

    osobówka.setMarka("Fiat");

    tir.setMarka("Mercedes");

    tir.getMarka();

    człowiek.getZawódWykonywany();
  }
}
