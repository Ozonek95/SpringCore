package zadania_cztery_AOP.pakiet_cztery.model;

/**
 * @author Kacper Staszek
 */
public class Artykuł {
  private final String tytuł;

  public Artykuł(String tytuł) {
    this.tytuł = tytuł;
  }

  @Override
  public String toString() {
    return "Artykuł{" +
        "tytuł='" + tytuł + '\'' +
        '}';
  }
}
