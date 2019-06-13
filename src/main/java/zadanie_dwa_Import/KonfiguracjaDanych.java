package zadanie_dwa_Import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kacper Staszek
 */
@Configuration
class KonfiguracjaDanych {
  @Bean
  ŹródłoDanych źródłoDanych(){
    return new ŹródłoDanychImpl();
  }
}
