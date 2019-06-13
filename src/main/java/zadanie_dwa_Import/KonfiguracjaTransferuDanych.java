package zadanie_dwa_Import;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Zwróć uwagę na autowiązanie źródłoDanych.
 *
 * @author Kacper Staszek
 */
@Configuration
class KonfiguracjaTransferuDanych {
  @Autowired
  ŹródłoDanych<Dane> źródłoDanych;

  @Bean
  TransferDanychSerwis serwis(){
    return new TransferDanychSerwisImpl(źródłoDanych.pobierzDane());
  }
}
