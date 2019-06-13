package zadanie_cztery_AOP.c_around_aspekt;

import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class RepozytoriumImpl implements Repozytorium {

  @Override
  public boolean metodaRepozytorium() {
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
