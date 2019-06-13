package zadanie_jeden_ComponentScan.pakiet_pięć;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class KlasaKtoraChcemy implements ChcemyTeKlase {
  public KlasaKtoraChcemy(){
    System.out.println("Tworzę klasę, której potrzebujemy.");
  }
}
