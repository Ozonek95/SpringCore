package zadanie_cztery_AOP.d_własne_adnotacje_i_aspekty.repozytoria;

import org.springframework.stereotype.Repository;

/**
 * Generyczne repozytorium - pozwala zapisywać obiekty różnych typów.
 *
 * @author Kacper Staszek
 */
@Repository
public interface MojeRepozytorium<T> {
  boolean zapisz(T obiekt);
}
