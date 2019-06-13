package zadanie_trzy_ApplicationListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class ZdarzenieCloseApp implements ApplicationListener<ContextClosedEvent> {

  @Override
  public void onApplicationEvent(ContextClosedEvent contextClosedEvent) {
    System.out.println("Zamykamy kontekst!");
  }
}
