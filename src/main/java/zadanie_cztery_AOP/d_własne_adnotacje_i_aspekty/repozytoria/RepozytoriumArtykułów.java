package zadanie_cztery_AOP.d_własne_adnotacje_i_aspekty.repozytoria;

import org.springframework.stereotype.Repository;
import zadanie_cztery_AOP.d_własne_adnotacje_i_aspekty.model.Artykuł;
import zadanie_cztery_AOP.d_własne_adnotacje_i_aspekty.serwisy.Loggable;

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
