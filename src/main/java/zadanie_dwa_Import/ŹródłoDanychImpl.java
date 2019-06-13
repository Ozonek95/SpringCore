package zadanie_dwa_Import;

/**
 * @author Kacper Staszek
 */
class ŹródłoDanychImpl implements ŹródłoDanych<Dane> {

  @Override
  public Dane pobierzDane() {
    return new Dane();
  }
}
