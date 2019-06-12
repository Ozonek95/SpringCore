package zadania_cztery_AOP.pakiet_cztery.repozytoria;

import org.springframework.stereotype.Repository;
import zadania_cztery_AOP.pakiet_cztery.model.Artykuł;

/**
 * Implementacja repozytorium Artykułów.
 *
 * @author Kacper Staszek
 */
@Repository
public class MyArticleRepository implements MyRepository<Artykuł> {

  @Override
  public boolean zapisz(Artykuł artykuł) {
    return true;
  }
}
