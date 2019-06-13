package zadanie_jeden_ComponentScan.pakiet_pięć;

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
