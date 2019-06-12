package zadanie_cztery_AOP.pakiet_cztery.repozytoria;

import org.springframework.stereotype.Repository;
import zadanie_cztery_AOP.pakiet_cztery.model.Artykuł;
import zadanie_cztery_AOP.pakiet_cztery.serwisy.Loggable;

/**
 * Implementacja repozytorium Artykułów.
 *
 * @author Kacper Staszek
 */
@Repository
public class MyArticleRepository implements MyRepository<Artykuł> {

  @Override
  @Loggable
  public boolean zapisz(Artykuł artykuł) {
    return true;
  }
}
