package zadanie_jeden_ComponentScan.pakiet_trzy;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;

/**
 * @author Kacper Staszek
 */
@Service
class KalkulatorImpl implements Kalkulator {

  @Override
  public BigDecimal dodaj(BigDecimal... a) {
    BigDecimal result = new BigDecimal("0");
    for (BigDecimal bigDecimal : a) {
      result=result.add(bigDecimal);
    }
    return result;
  }

  @Override
  public BigDecimal odejmij(BigDecimal liczba, BigDecimal... doOdjęcia) {
    BigDecimal result = liczba;
    for (BigDecimal bigDecimal : doOdjęcia) {
      result=result.subtract(bigDecimal);
    }
    return result;
  }

}
