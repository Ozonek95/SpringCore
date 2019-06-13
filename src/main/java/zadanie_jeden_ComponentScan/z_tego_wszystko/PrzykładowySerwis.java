package zadanie_jeden_ComponentScan.z_tego_wszystko;

import org.springframework.stereotype.Service;

/**
 * @author Kacper Staszek
 */
@Service
class PrzykładowySerwis implements Serwis {

  @Override
  public void wykonujUsługę() {
    System.out.println("Przykładowa usługa");
  }
}
