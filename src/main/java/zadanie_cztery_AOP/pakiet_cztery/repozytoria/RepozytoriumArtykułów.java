package zadanie_cztery_AOP.pakiet_cztery.repozytoria;

import org.springframework.stereotype.Repository;
import zadanie_cztery_AOP.pakiet_cztery.model.Artykuł;
import zadanie_cztery_AOP.pakiet_cztery.serwisy.Loggable;

/**
 * @author Kacper Staszek
 */
@Repository
class RepozytoriumArtykułów implements MojeRepozytorium<Artykuł> {

  @Override
  @Loggable
  public boolean zapisz(Artykuł artykuł) {
    return true;
  }
}
