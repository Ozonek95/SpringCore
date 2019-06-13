package zadanie_cztery_AOP.d_własne_adnotacje_i_aspekty.model;

/**
 * @author Kacper Staszek
 */
public class Użytkownik {
  private final String imie;

  public Użytkownik(String imie) {
    this.imie = imie;
  }

  @Override
  public String toString() {
    return "Użytkownik{" +
        "imie='" + imie + '\'' +
        '}';
  }
}
