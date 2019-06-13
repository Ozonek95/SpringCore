package zadanie_jeden_ComponentScan.z_tego_też_wszystko;

import org.springframework.stereotype.Repository;
import zadanie_jeden_ComponentScan.z_tego_nic.Użytkownik;

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
