package zadanie_jeden_ComponentScan.z_tego_część;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class KlasaKtorejNieChcemy implements NieChcemyTejKlasy {
  public KlasaKtorejNieChcemy(){
    System.out.println("Tworzę klasę, której nie chcemy");
  }
}
