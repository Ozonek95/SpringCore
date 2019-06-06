package zadanieDrugieImport;

/**
 * @author Kacper Staszek
 */
class DataTransferServiceImpl implements DataTransferService<Data> {
  private Data data;

  DataTransferServiceImpl(Data data){
    this.data=data;
  }
  @Override
  public void transferData() {
    System.out.println("Doing stuff with data");
  }
}
