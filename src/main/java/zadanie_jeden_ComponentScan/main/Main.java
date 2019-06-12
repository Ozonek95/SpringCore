package zadanie_jeden_ComponentScan.main;

import java.math.BigDecimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import zadanie_jeden_ComponentScan.pakiet_cztery.User;
import zadanie_jeden_ComponentScan.pakiet_dwa.UserRepository;
import zadanie_jeden_ComponentScan.pakiet_jeden.Logger;
import zadanie_jeden_ComponentScan.pakiet_pięć.NieChcemyTejKlasy;
import zadanie_jeden_ComponentScan.pakiet_trzy.Calculator;

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
@ComponentScan(basePackages = {"zadanie_jeden_ComponentScan.pakiet_jeden", "zadanie_jeden_ComponentScan.pakiet_dwa",
    "zadanie_jeden_ComponentScan.pakiet_trzy", "zadanie_jeden_ComponentScan.pakiet_pięć"},
    excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = NieChcemyTejKlasy.class))
class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

    context.getBean(UserRepository.class).save(new User("Kacpi"));

    context.getBean(Logger.class).log("prosto z main");

    System.out
        .println(context.getBean(Calculator.class).add(new BigDecimal("5"), new BigDecimal("8.5")));
  }
}
