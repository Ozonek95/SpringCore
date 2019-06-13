package zadanie_jeden_ComponentScan.pakiet_trzy;

import java.math.BigDecimal;

/**
 * @author Kacper Staszek
 */
public interface Kalkulator {
  BigDecimal dodaj(BigDecimal ... a);
  BigDecimal odejmij(BigDecimal liczba, BigDecimal ... doOdjęcia);
}
