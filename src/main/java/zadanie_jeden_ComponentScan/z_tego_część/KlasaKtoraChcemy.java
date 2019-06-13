package zadanie_jeden_ComponentScan.z_tego_część;

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
