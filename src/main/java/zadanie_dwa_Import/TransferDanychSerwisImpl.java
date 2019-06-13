package zadanie_dwa_Import;

/**
 * Implementacja na potrzeby zadania.
 *
 * @author Kacper Staszek
 */
class TransferDanychSerwisImpl implements TransferDanychSerwis<Dane> {
  private Dane dane;

  TransferDanychSerwisImpl(Dane dane){
    this.dane = dane;
  }
  @Override
  public void transferDanych() {
    System.out.println("Robię rzeczy z danymi");
  }
}
