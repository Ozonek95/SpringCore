package zadanie_jeden_ComponentScan.pakiet_jeden;

import org.springframework.stereotype.Service;

/**
 * @author Kacper Staszek
 */
@Service
class LoggerImpl implements Logger {

  @Override
  public void log(String wiadomość) {
    System.out.println("Loguję wiadomość: "+wiadomość);
  }
}
