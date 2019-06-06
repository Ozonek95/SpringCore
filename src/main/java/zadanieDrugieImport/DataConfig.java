package zadanieDrugieImport;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kacper Staszek
 */
@Configuration
class DataConfig {
  @Bean
  DataSource dataSource(){
    return new DataSourceImpl();
  }
}
