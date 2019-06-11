package zadanieCzwarteAOP.pakiet_cztery.serwisy;

import org.springframework.stereotype.Service;

/**
 * Implementacja usługi logowania.
 *
 * @author Kacper Staszek
 */
@Service
class LoggerImpl implements Logger {

  @Override
  public void loguj(String wiadomość) {
    System.out.println("Loguję: "+wiadomość);
  }
}
