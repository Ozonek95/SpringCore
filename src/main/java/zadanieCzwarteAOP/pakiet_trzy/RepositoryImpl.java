package zadanieCzwarteAOP.pakiet_trzy;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class RepositoryImpl implements Repository {

  @Override
  public boolean repoMethod() {
    System.out.println("start");
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("end");

    return true;
  }
}
