package zadanie_cztery_AOP.d_własne_adnotacje_i_aspekty.model;

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
