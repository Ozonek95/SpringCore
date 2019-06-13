package zadanie_jeden_ComponentScan.pakiet_dwa;

import org.springframework.stereotype.Repository;
import zadanie_jeden_ComponentScan.pakiet_cztery.Użytkownik;

/**
 * Implementacja na potrzeby zadania.
 *
 * @author Kacper Staszek
 */
@Repository
class RepozytoriumUżytkownikówImpl implements RepozytoriumUżytkowników {

  @Override
  public void save(Użytkownik użytkownik) {
    System.out.println("Zapisuję użytkownik "+ użytkownik);
  }
}
