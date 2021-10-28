public class ClientesDados extends ProdutosDados {
  private String name;
  private String phone;
  private String adress;
  private String postDate;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return this.phone;
  }

  public String setPhone(String phone) {
    return this.phone = phone;
  }

  public String getAdress() {
    return this.adress;
  }

  public String setAdress(String adress) {
    return this.adress = adress;
  }

  public String getPostDate() {
    return this.postDate;
  }

  public String setPostDate(String postDate) {
    return this.postDate = postDate;
  }

  public void returnClientType() {
    System.out.println("\n------------------------");
    System.out.println("INFORMAÇÕES DO CLIENTE");
    System.out.println("O tipo do cliente é");
    System.out.println("O nome do cliente é: " + getName());
    System.out.println("O telefone do cliente é: " + getPhone());
    System.out.println("O endereço do cliente é: " + getAdress());
    System.out.println("A data de cadastro do produto é: " + getPostDate());
  }

}
