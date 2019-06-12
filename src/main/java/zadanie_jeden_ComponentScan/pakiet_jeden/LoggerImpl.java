package zadanie_jeden_ComponentScan.pakiet_jeden;

import org.springframework.stereotype.Service;

/**
 * @author Kacper Staszek
 */
@Service
class LoggerImpl implements Logger {

  @Override
  public void log(String message) {
    System.out.println("Logging message: "+message);
  }
}