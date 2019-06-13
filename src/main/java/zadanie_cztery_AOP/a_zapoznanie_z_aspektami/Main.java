package zadanie_cztery_AOP.a_zapoznanie_z_aspektami;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Wprowadzenie do SpringAOP czyli programowania aspektowego.
 * Na początku zachęcam do przeczytania krótkiego artykułu, który szybko wyjaśni czym mniej więcej
 * jest Spring AOP
 *
 * TODO:
 *  przeczytaj: -https://www.javatpoint.com/spring-aop-tutorial
 *
 *  Po przeczytaniu przyjrzymy się działaniu najprostszych przykładów wykorzystania Aspektów.
 *  W tym tutorialu wykorzystamy aspectj (podglądnij pom.xml, żeby zobaczyć zależności).
 *
 *  WAŻNE: Żeby nasz program wykorzystał AspektJ, nasza konfiguracyjna klasa musi być zaadnotowana
 *  @see @EnableAspectJAutoProxy
 *
 * TODO: Przejdź do klasy Aspekt i podążaj za instrukcjami.
 *
 * @author Kacper Staszek
 */
@ComponentScan
@EnableAspectJAutoProxy
class Main {

  public static void main(String[] args) throws Exception {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(Main.class);

    Człowiek człowiek = kontekst.getBean(Człowiek.class);

    człowiek.setImie("Kacpi");

    człowiek.getImie();

    człowiek.setNazwisko("Staszek");

    człowiek.getNazwisko();

    //FIXME: Do odkomentowania później! Znajdziesz odpowiednią instrukcję w klasie Aspekt.
    człowiek.rzućWyjątek();

  }

}
