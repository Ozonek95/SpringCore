package zadanieTrzecie;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class StopAppEvent implements ApplicationListener<ContextStoppedEvent> {

  @Override
  public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
    System.out.println("Siema ze stopu!");
  }
}
