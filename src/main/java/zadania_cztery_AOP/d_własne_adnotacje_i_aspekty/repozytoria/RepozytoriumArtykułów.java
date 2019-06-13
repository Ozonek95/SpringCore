package zadania_cztery_AOP.d_własne_adnotacje_i_aspekty.repozytoria;

import zadania_cztery_AOP.d_własne_adnotacje_i_aspekty.modele.Artykuł;

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
