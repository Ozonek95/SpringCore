package zadanieCzwarteAOP.pakiet_cztery.repozytoria;

import org.springframework.stereotype.Repository;
import zadanieCzwarteAOP.pakiet_cztery.model.Artykuł;
import zadanieCzwarteAOP.pakiet_cztery.serwisy.Loggable;

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
