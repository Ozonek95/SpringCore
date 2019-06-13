package zadania_cztery_AOP.pakiet_cztery.repozytoria;

import org.springframework.stereotype.Repository;
import zadania_cztery_AOP.pakiet_cztery.model.Użytkownik;

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
