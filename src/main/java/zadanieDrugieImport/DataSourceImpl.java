package zadanieDrugieImport;

/**
 * @author Kacper Staszek
 */
class DataSourceImpl implements DataSource<Data> {

  @Override
  public Data getData() {
    return new Data();
  }
}
