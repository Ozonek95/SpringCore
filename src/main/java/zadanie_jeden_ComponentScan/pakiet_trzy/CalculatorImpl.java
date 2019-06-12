package zadanie_jeden_ComponentScan.pakiet_trzy;

import java.math.BigDecimal;
import org.springframework.stereotype.Service;

/**
 * @author Kacper Staszek
 */
@Service
class CalculatorImpl implements Calculator {

  @Override
  public BigDecimal add(BigDecimal... a) {
    BigDecimal result = new BigDecimal("0");
    for (BigDecimal bigDecimal : a) {
      result=result.add(bigDecimal);
    }
    return result;
  }

  @Override
  public BigDecimal subtract(BigDecimal number, BigDecimal... toSubtract) {
    BigDecimal result = number;
    for (BigDecimal bigDecimal : toSubtract) {
      result=result.subtract(bigDecimal);
    }
    return result;
  }

}
