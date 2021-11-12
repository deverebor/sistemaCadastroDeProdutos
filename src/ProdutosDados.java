public class ProdutosDados {
  private String productName;
  private String productsData;
  private String productsPrice;

  public ProdutosDados(){}

  public ProdutosDados(String productName, String productsData, String productsPrice) {
    this.productName = productName;
    this.productsData = productsData;
    this.productsPrice = productsPrice;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductsData() {
    return productsData;
  }

  public void setProductsData(String productsData) {
    this.productsData = productsData;
  }

  public String getProductsPrice() {
    return productsPrice;
  }

  public void setProductsPrice(String productsPrice) {
    this.productsPrice = productsPrice;
  }
}
