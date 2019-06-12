package zadanie_cztery_AOP.pakiet_trzy;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class RepositoryImpl implements Repository {

  @Override
  public boolean repoMethod() {
    System.out.println("rozpoczynam zapis");
    try {
      Thread.sleep(ThreadLocalRandom.current().nextInt(5000));
    } catch (InterruptedException e) {
      System.err.println(e.getMessage());
      return false;
    }
    System.out.println("zapis zakończony");
    return true;
  }
}
