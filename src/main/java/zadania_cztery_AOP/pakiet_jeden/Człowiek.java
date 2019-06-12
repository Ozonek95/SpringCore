package zadania_cztery_AOP.pakiet_jeden;

import org.springframework.stereotype.Component;

/**
 * @author Kacper Staszek
 */
@Component
class Człowiek {

  private String imie;
  private String nazwisko;

  public String getImie() {
    return imie;
  }

  public void setImie(String imie) {
    this.imie = imie;
  }

  public String getNazwisko() {
    return nazwisko;
  }

  public void setNazwisko(String nazwisko) {
    this.nazwisko = nazwisko;
  }

  public void rzućWyjątek() throws Exception {
    throw new Exception("Przykładowy wyjątek");
  }
}
