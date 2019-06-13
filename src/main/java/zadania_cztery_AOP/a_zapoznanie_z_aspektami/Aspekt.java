package zadania_cztery_AOP.a_zapoznanie_z_aspektami;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Klasa, w której będziemy definiować nasze aspekty musi być zaadnotowana jako @Aspect.
 *
 * @author Kacper Staszek
 */
@Aspect
@Component
class Aspekt {

  /**
   * TODO: Przeczytaj akapit.
   * Adnotacja @Before uruchomi się zawsze przed wywołaniem metody
   * zdefiniowanej jako Join Point. Definiowanie Join Point odbywa się z pomocą pointcut
   * expressions. Jest on na początku dość ciężki do swobodnego definiowania tego co chcemy, jednak
   * wraz z praktyką jest coraz lepiej :) Na początek polecam wspierać się tymi artykułami:
   * -http://javainsimpleway.com/understanding-the-pointcut-expressions/
   * -https://howtodoinjava.com/spring-aop/aspectj-pointcut-expressions/
   *
   * TODO: Przeczytaj komentarze nad kolejnymi metodami. Następnie odkomentuj adnotacje AspectJ'ya,
   *  uruchom program i zobacz działanie. jeżeli będzie Ci wygodniej, po uruchomieniu zakomentuj
   *  linię spowrotem, bo po kolejnych przykładach wydruki na konsolę mogą się zrobić mało czytelne.
   *
   * TODO: Po zapoznaniu się z działaniem odpowiednich aspektów przejdź do b_pointcut_expressions.
   */

  //Uruchomi się przed egzekucją każdej publicznej metody z dowolnym typem zwracanym, zdefiniowaną
  //jako setImie z dowolną liczbą argumentów.
  //FIXME: Odkomentuj.
  //@Before("execution(public * setImie(..))")
  void przedSetName() {
    System.out.println("Aspekt przed setImie");
  }

  //Uruchomi się przed wykonaniem publicznej metody z dowolnym typem zwracanym, zdefiniowanej
  //jako getNazwisko z dowolną liczbą argumentów.
  //FIXME: Odkomentuj.
  //@Before("execution(public * getNazwisko(..))")
  void przedGetNazwisko() {
    System.out.println("Aspekt przed getNazwisko");
  }

  //Uruchomi się przed wykonaniem metody o dowolnym modyfikatorze dostępu z dowolnym typem zwracanym,
  //której nazwa zaczyna się od get z dowolną liczbą argumentów.
  //Dodatkowo używamy tu pierwszy raz JoinPoint. Daje on nam dostęp do informacji na temat wywołania metody.
  //Zachęcam do poczytania dokumentacji:

  /**
   * @see JoinPoint
   */
  //FIXME: Odkomentuj.
  //@Before("execution(* get*(..))")
  void getteryZJoinPoint(JoinPoint joinPoint) {
    System.out.println("Aspekt wywołany przed metodą " + joinPoint.getSignature().getName());
  }

  //Uruchomi się przed każdą metodą, która jako argument przyjmie (w tym przypadku) Stringa.
  //Zauważ, że w metodzie mamy dostęp do przekazanej wartości.
  //FIXME: Odkomentuj.
  //@Before("args(przekazanyString)")
  void przedMetodamiKtórePrzyjmująParametrString(JoinPoint joinPoint, String przekazanyString) {
    System.out.println("Aspekt przed metodą " + joinPoint.getSignature().getName()
        + " z przekazanym argumentem " + przekazanyString);
  }

  //Aspekt uruchomi się po zakończeniu każdej metody. NAWET TAKIEJ, KTÓRA WYRZUCI WYJĄTEK!
  //Możesz teraz odkomentować wywołanie człowiek.rzućWyjątek() i zobaczyć działanie.
  //FIXME: Odkomentuj
  //@After("within(Człowiek)")
  void poKażdejMetodzieKlasyCzłowiek(JoinPoint joinPoint) {
    System.out.println("Aspekt wywoływany po każdej metodzie klasy człowiek! "
        + "NAWET JEŻELI SKOŃCZY SIĘ WYJĄTKIEM! wywoływana metoda to: " + joinPoint.getSignature()
        .getName());
  }

  //Aspekt uruchomi się po zwróceniu wartości przez publiczne metody zwracające String w klasie człowiek.
  //Zauważ, że mamy dostęp do zwracanej wartości.
  //FIXME: Odkomentuj.
  //@AfterReturning(pointcut = "execution(public String Człowiek.*(..))", returning = "zwrócono")
  void poZwróceniuStringaZKlasyCzłowiek(JoinPoint joinPoint, String zwrócono) {
    System.out.println(
        "Aspekt po zwróceniu wartości przez metodę " + joinPoint.getSignature().getName() + ". "
            + "Zwrócowa wartość to: " + zwrócono);
  }

  //Aspekt uruchomi się po wyrzuceniu wyjątku przez jakąkolwiek metodę klasy Człowiek.
  //Zauważ, że mamy dostęp do wyjątku w ciele metody.
  //@FIXME: Odkomentuj.
  //@AfterThrowing(pointcut = "within(Człowiek)",throwing = "wyjątek")
  void poWyrzuceniuWyjątku(JoinPoint joinPoint, Throwable wyjątek) {
    System.out
        .println("Aspekt po wyrzuceniu wyjątku. Metoda " + joinPoint.getSignature().getName() + " "
            + "Wyrzuciła wyjątek " + wyjątek);
  }
}
