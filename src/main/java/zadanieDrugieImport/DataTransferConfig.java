package zadanieDrugieImport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Zwróć uwagę na autowiązanie dataSource.
 *
 * @author Kacper Staszek
 */
@Configuration
@Import(DataConfig.class)
class DataTransferConfig {
  @Autowired
  DataSource<Data> dataSource;

  @Bean
  DataTransferService service(){
    return new DataTransferServiceImpl(dataSource.getData());
  }
}
