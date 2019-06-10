package zadaniePierwsze.main;

import java.math.BigDecimal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import zadaniePierwsze.pakietCzwarty.User;
import zadaniePierwsze.pakietDrugi.UserRepository;
import zadaniePierwsze.pakietPierwszy.Logger;
import zadaniePierwsze.pakietTrzeci.Calculator;

/**
 * Działanie @ComponentScan
 *
 * TODO: Doprowadź program do działania bez rzucania wyjątku. Zauważ, że nie musimy skanować pakietu
 *  "pakietCzwarty". Żeby zaoszczędzić Springowi pracy, zeskanuj tylko potrzebne pakiety.
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
    ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

    context.getBean(UserRepository.class).save(new User("Kacpi"));

    context.getBean(Logger.class).log("prosto z main");

    System.out
        .println(context.getBean(Calculator.class).add(new BigDecimal("5"), new BigDecimal("8.5")));
  }
}