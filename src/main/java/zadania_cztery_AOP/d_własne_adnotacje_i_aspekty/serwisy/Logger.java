package zadania_cztery_AOP.d_własne_adnotacje_i_aspekty.serwisy;

import org.springframework.stereotype.Service;

/**
 * Serwis logujący.
 *
 * @author Kacper Staszek
 */
@Service
public interface Logger {
  void loguj(String wiadomość);
}
