package zadania_cztery_AOP.pakiet_cztery.repozytoria;

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
