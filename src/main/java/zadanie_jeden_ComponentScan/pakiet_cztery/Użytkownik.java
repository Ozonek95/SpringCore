package zadanie_jeden_ComponentScan.pakiet_cztery;

/**
 * @author Kacper Staszek
 */

public class Użytkownik {
  private final String imię;

  public Użytkownik(String imię) {
    this.imię = imię;
  }

  @Override
  public String toString() {
    return "Użytkownik{" +
        "imię='" + imię + '\'' +
        '}';
  }
}
