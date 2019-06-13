package zadanie_jeden_ComponentScan.z_tego_wszystko;

import org.springframework.stereotype.Service;

/**
 * Implementacja na potrzeby zadania.
 *
 * @author Kacper Staszek
 */
@Service
class PrzykładowySerwis implements Serwis {


  @Override
  public void wykonujUsługę() {
    System.out.println("Przykładowa usługa");
  }
}
