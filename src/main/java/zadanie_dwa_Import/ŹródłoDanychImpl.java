package zadanie_dwa_Import;

/**
 * Implementacja źródła danych na potrzeby zadania.
 *
 * @author Kacper Staszek
 */
class ŹródłoDanychImpl implements ŹródłoDanych<Dane> {

  @Override
  public Dane pobierzDane() {
    return new Dane();
  }
}
