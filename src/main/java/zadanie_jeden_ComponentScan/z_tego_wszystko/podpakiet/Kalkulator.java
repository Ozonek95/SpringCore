package zadanie_jeden_ComponentScan.z_tego_wszystko.podpakiet;

import java.math.BigDecimal;

/**
 * @author Kacper Staszek
 */
public interface Kalkulator {
  BigDecimal dodaj(BigDecimal ... a);
  BigDecimal odejmij(BigDecimal liczba, BigDecimal ... doOdjęcia);
}
