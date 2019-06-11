package zadanieCzwarteAOP.pakiet_cztery.repozytoria;

import org.springframework.stereotype.Repository;
import zadanieCzwarteAOP.pakiet_cztery.model.Użytkownik;
import zadanieCzwarteAOP.pakiet_cztery.serwisy.Loggable;

/**
 * Implementacja repozytorium Użytkowników.
 *
 * @author Kacper Staszek
 */
@Repository
class MyUserRepository implements MyRepository<Użytkownik> {

  @Override
  @Loggable
  public boolean zapisz(Użytkownik użytkownik) {
    return true;
  }
}
