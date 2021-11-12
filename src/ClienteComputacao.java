public class ClienteComputacao extends ClientesDados {
  private String tech;
  private String companyDescription;
  private ProdutosDados produtosDados;

  public String getTech() {
    return tech;
  }

  public void setTech(String tech) {
    this.tech = tech;
  }

  public String getCompanyDescription() {
    return companyDescription;
  }

  public void setCompanyDescription(String companyDescription) {
    this.companyDescription = companyDescription;
  }

  public ProdutosDados getProdutosDados() {
    return produtosDados;
   }

  public void setProdutosDados(ProdutosDados produtosDados) {
   this.produtosDados = produtosDados;
  }
  
  @Override
  public void returnClientType() {
    System.out.println("\n------------------------");
    System.out.println("INFORMAÇÕES DO CLIENTE");
    System.out.println("O tipo do cliente é");
    System.out.println("O nome do cliente é: " + getName());
    System.out.println("O telefone do cliente é: " + getPhone());
    System.out.println("O endereço do cliente é: " + getAdress());
    System.out.println("A data de cadastro do produto é: " + getPostDate());
    System.out.println("\nINFORMAÇÕES DO PRODUTO");
    System.out.println("Nome do produto: " + produtosDados.getProductName());
    System.out.println("Data de envio do produto: " + produtosDados.getProductsData());
    System.out.println("Preço do produto: " + produtosDados.getProductsPrice() + "\n");
  }

}
