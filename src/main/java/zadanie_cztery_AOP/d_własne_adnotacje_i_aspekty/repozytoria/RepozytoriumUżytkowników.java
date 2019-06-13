package zadanie_cztery_AOP.d_własne_adnotacje_i_aspekty.repozytoria;

import org.springframework.stereotype.Repository;
import zadanie_cztery_AOP.d_własne_adnotacje_i_aspekty.model.Użytkownik;
import zadanie_cztery_AOP.d_własne_adnotacje_i_aspekty.serwisy.Loggable;

/**
 * Implementacja repozytorium Użytkowników.
 *
 * @author Kacper Staszek
 */
@Repository
class RepozytoriumUżytkowników implements MojeRepozytorium<Użytkownik> {

  @Override
  @Loggable
  public boolean zapisz(Użytkownik użytkownik) {
    return true;
  }
}
