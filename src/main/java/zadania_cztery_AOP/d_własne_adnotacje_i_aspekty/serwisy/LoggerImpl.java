package zadania_cztery_AOP.d_własne_adnotacje_i_aspekty.serwisy;

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
