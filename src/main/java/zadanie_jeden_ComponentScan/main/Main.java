package zadanie_jeden_ComponentScan.main;

import java.math.BigDecimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zadanie_jeden_ComponentScan.pakiet_cztery.Użytkownik;
import zadanie_jeden_ComponentScan.pakiet_dwa.RepozytoriumUżytkowników;
import zadanie_jeden_ComponentScan.pakiet_jeden.Logger;
import zadanie_jeden_ComponentScan.pakiet_trzy.Kalkulator;

/**
 * Działanie @ComponentScan
 *
 * TODO: Doprowadź program do działania bez rzucania wyjątku. Zauważ, że nie musimy skanować pakietu
 *  "pakiet_cztery". Żeby zaoszczędzić Springowi pracy, zeskanuj tylko potrzebne pakiety.
 *
 * TODO: Kiedy program już działa, zauważ, że tworzymy ziarno "KlasyKtórejNieChcemy". Za pomocą
 *  @ComponentScan.Filter rozwiąż ten problem tak, żeby wciąż tworzyć ziarno KlasaKtoraChcemy.
 *
 *  -https://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/context/annotation/ComponentScan.html
 *
 * @author Kacper Staszek
 */

class Main {

  public static void main(String[] args) {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(Main.class);

    kontekst.getBean(RepozytoriumUżytkowników.class).save(new Użytkownik("Kacpi"));

    kontekst.getBean(Logger.class).log("prosto z main");

    System.out
        .println(kontekst.getBean(Kalkulator.class).dodaj(new BigDecimal("5"), new BigDecimal("8.5")));
  }
}
