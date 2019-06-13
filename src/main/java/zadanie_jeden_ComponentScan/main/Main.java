package zadanie_jeden_ComponentScan.main;

import java.math.BigDecimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zadania_cztery_AOP.d_własne_adnotacje_i_aspekty.serwisy.Logger;
import zadanie_jeden_ComponentScan.z_tego_nic.Użytkownik;
import zadanie_jeden_ComponentScan.z_tego_też_wszystko.RepozytoriumUżytkowników;
import zadanie_jeden_ComponentScan.z_tego_wszystko.podpakiet.Kalkulator;

/**
 * Działanie @ComponentScan
 *
 * TODO: Doprowadź program do działania bez rzucania wyjątku. Zauważ, że nie musimy skanować pakietu
 *  "z_tego_nic". Żeby zaoszczędzić Springowi pracy, zeskanuj tylko potrzebne pakiety.
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

    kontekst.getBean(Logger.class).loguj("prosto z main");

    System.out
        .println(kontekst.getBean(Kalkulator.class).dodaj(new BigDecimal("5"), new BigDecimal("8.5")));
  }
}
