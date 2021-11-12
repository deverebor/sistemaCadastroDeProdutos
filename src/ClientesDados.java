public class ClientesDados {
  private String name;
  private String phone;
  private String adress;
  private String postDate;
  private ProdutosDados produtosDados;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return this.phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAdress() {
    return this.adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }

  public String getPostDate() {
    return this.postDate;
  }

  public void setPostDate(String postDate) {
    this.postDate = postDate;
  }

  public ProdutosDados getProdutosDados() {
    return this.produtosDados;
   }

  public void setProdutosDados(ProdutosDados produtosDados) {
   this.produtosDados = produtosDados;
  }

  public void returnClientType() {
    System.out.println("\n------------------------");
    System.out.println("INFORMAÇÕES DO CLIENTE");
    System.out.println("O tipo do cliente é");
    System.out.println("O nome do cliente é: " + getName());
    System.out.println("O telefone do cliente é: " + getPhone());
    System.out.println("O endereço do cliente é: " + getAdress());
    System.out.println("A data de cadastro do produto é: " + getPostDate());
    System.out.println("\n------------------------");
    System.out.println("INFORMAÇÕES DO PRODUTO");
    System.out.println("Nome do produto: " + produtosDados.getProductName());
    System.out.println("Data de envio do produto: " + produtosDados.getProductsData());
    System.out.println("Preço do produto: " + produtosDados.getProductsPrice() + "\n");
  }
}
