package zadanie_dwa_Import;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Zwróć uwagę na autowiązanie dataSource.
 *
 * @author Kacper Staszek
 */
@Configuration
class DataTransferConfig {
  @Autowired
  DataSource<Data> dataSource;

  @Bean
  DataTransferService service(){
    return new DataTransferServiceImpl(dataSource.getData());
  }
}
