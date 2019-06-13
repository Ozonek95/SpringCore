package zadanie_cztery_AOP.pakiet_cztery.repozytoria;

import org.springframework.stereotype.Repository;
import zadanie_cztery_AOP.pakiet_cztery.model.Użytkownik;
import zadanie_cztery_AOP.pakiet_cztery.serwisy.Loggable;

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
