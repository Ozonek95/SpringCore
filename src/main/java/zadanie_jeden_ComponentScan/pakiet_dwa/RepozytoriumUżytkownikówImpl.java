package zadanie_jeden_ComponentScan.pakiet_dwa;

import org.springframework.stereotype.Repository;
import zadanie_jeden_ComponentScan.pakiet_cztery.Użytkownik;

/**
 * @author Kacper Staszek
 */
@Repository
class RepozytoriumUżytkownikówImpl implements RepozytoriumUżytkowników {

  @Override
  public void zapisz(Użytkownik użytkownik) {
    System.out.println("Zapisuję użytkownika "+ użytkownik);
  }
}
