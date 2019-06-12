package zadania_cztery_AOP.pakiet_dwa.samochody;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
public class Tir {
  private String marka;

  public String getMarka() {
    return marka;
  }

  public void setMarka(String marka) {
    this.marka = marka;
  }
}
