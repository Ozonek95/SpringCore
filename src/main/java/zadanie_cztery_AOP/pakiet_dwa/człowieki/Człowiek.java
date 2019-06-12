package zadanie_cztery_AOP.pakiet_dwa.człowieki;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
public class Człowiek {

  private String zawódWykonywany;

  public void setZawódWykonywany(String zawódWykonywany) {
    this.zawódWykonywany = zawódWykonywany;
  }

  public String getZawódWykonywany() {
    return zawódWykonywany;
  }

  public void wyrzucaWyjątek() throws Exception {
    System.out.println("rzucam wyjątkiem");
    throw new Exception("Człowiek przykładowy wyjątek");
  }
}
