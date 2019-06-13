package zadania_cztery_AOP.pakiet_cztery.repozytoria;

import zadania_cztery_AOP.pakiet_cztery.model.Artykuł;

/**
 * Implementacja repozytorium Artykułów.
 *
 * @author Kacper Staszek
 */
class RepozytoriumArtykułów implements MojeRepozytorium<Artykuł> {

  @Override
  public boolean zapisz(Artykuł obiekt) {
    return true;
  }
}
