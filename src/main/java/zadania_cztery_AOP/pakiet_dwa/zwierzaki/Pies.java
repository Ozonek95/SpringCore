package zadania_cztery_AOP.pakiet_dwa.zwierzaki;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
public class Pies {

  private String imie;

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public void wyrzucaWyjątek() throws Exception {
    System.out.println("rzucam wyjątkiem");
    throw new Exception("Pies przykładowy wyjątek");
  }

}
