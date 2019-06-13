package zadanie_dwa_Import;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Proste ćwiczenie z @Import
 *
 * TODO:
 *  Doprowadź program do poprawnego działania. Zauważ, że mamy dwie klasy konfiguracji. Jednak w konstruktorze
 *  kontekstu wprowadzamy tylko jedną.
 *
 *  -https://docs.spring.io/spring-javaconfig/docs/1.0.0.M4/reference/html/ch04s03.html
 *
 * @author Kacper Staszek
 */
class Main {

  public static void main(String[] args) {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(KonfiguracjaTransferuDanych.class);
    kontekst.getBean(TransferDanychSerwis.class).transferDanych();
  }
}
