package zadanieCzwarteAOP.pakiet_cztery.repozytoria;

import org.springframework.stereotype.Repository;
import zadanieCzwarteAOP.pakiet_cztery.model.Użytkownik;

/**
 * Implementacja repozytorium Użytkowników.
 *
 * @author Kacper Staszek
 */
@Repository
class MyUserRepository implements MyRepository<Użytkownik> {

  @Override
  public boolean zapisz(Użytkownik użytkownik) {
    return true;
  }
}