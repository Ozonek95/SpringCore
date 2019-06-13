package zadanie_trzy_ApplicationListener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class ZdarzenieStartApp implements ApplicationListener<ContextStartedEvent> {

  @Override
  public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
    System.out.println("Kontekst wystartował");
  }
}
