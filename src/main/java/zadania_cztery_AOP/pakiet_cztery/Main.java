package zadania_cztery_AOP.pakiet_cztery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import zadania_cztery_AOP.pakiet_cztery.model.Artykuł;
import zadania_cztery_AOP.pakiet_cztery.model.Użytkownik;
import zadania_cztery_AOP.pakiet_cztery.repozytoria.MyRepository;

/**
 * Spring AOP umożliwia uruchamianie pewnych Aspektów nad metodami o danej adnotacji.
 *
 * - https://docs.spring.io/spring/docs/4.3.15.RELEASE/spring-framework-reference/html/aop.html
 *
 * Zadaniem jest stworzenie aspektu, który użyje ziarna Logger do logowania informacji na temat
 * wykonania metody, która jest zaadnotowana @Loggable. Zaadnotuj metody zapisz() w implementacjach MyRepository.
 *
 * Logowane informacje:
 *
 *  1.Metoda, która została wywołana (nazwa).
 *  2.Na jakim obiekcie została wywołana
 *  3.Jakie argumenty przyjęła,
 *  4.Co zwróciła.
 *
 * TODO:
 *  1: Stwórz odpowiednią adnotację
 *  2: Stwórz odpowiedni aspekt.
 *  3: Uruchom program i sprawdź, czy faktycznie loguje na konsolę.
 *
 * @author Kacper Staszek
 */
@EnableAspectJAutoProxy
@ComponentScan
class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    var myArticleRepository = (MyRepository<Artykuł>) context.getBean("myArticleRepository");
    var myUserRepository = (MyRepository<Użytkownik>) context.getBean("myUserRepository");

    myUserRepository.zapisz(new Użytkownik("Kacper"));
    myArticleRepository.zapisz(new Artykuł("O pogodzie xD"));
  }

}
