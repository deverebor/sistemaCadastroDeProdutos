public class ProdutosDados {
  private String productName;
  private String productsData;
  private String productsPrice;

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

  public void returnProductType() {
    System.out.println("\nINFORMAÇÕES DO PRODUTO");
    System.out.println("Nome do produto: " + getProductName());
    System.out.println("Data de envio do produto: " + getProductsData());
    System.out.println("Preço do produto: " + getProductsPrice() + "\n");
  }
}
