package zadania_cztery_AOP.pakiet_cztery.model;

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
