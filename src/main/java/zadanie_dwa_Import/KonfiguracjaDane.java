package zadanie_dwa_Import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Implementacja na potrzeby zadania
 *
 * @author Kacper Staszek
 */
@Configuration
class KonfiguracjaDane {
  @Bean
  ŹródłoDanych źródłoDanych(){
    return new ŹródłoDanychImpl();
  }
}
