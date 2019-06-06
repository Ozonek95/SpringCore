package zadaniePierwsze.pakietTrzeci;

import java.math.BigDecimal;

/**
 * @author Kacper Staszek
 */
public interface Calculator {
  BigDecimal add(BigDecimal ... a);
  BigDecimal subtract(BigDecimal number, BigDecimal ... toSubtract);
}
