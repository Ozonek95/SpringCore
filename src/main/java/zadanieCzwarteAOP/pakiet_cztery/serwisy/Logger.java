package zadanieCzwarteAOP.pakiet_cztery.serwisy;

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
