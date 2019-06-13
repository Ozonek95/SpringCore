package zadania_cztery_AOP.d_własne_adnotacje_i_aspekty.repozytoria;

import org.springframework.stereotype.Repository;
import zadania_cztery_AOP.d_własne_adnotacje_i_aspekty.modele.Użytkownik;

/**
 * Implementacja repozytorium Użytkowników.
 *
 * @author Kacper Staszek
 */
@Repository
class RepozytoriumUżytkowników implements MojeRepozytorium<Użytkownik> {

  @Override
  public boolean zapisz(Użytkownik użytkownik) {
    return true;
  }
}
