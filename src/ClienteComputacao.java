public class ClienteComputacao extends ClientesDados {
  private String tech;
  private String companyDescription;

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

  @Override
  public void returnClientType() {
    System.out.println("------------------------");
    System.out.println("INFORMAÇÕES DO CLIENTE:");
    System.out.println("O cliente é da área de Computação");
    System.out.println("O nome do cliente é: " + getName());
    System.out.println("O telefone do cliente é: " + getPhone());
    System.out.println("O endereço do cliente é: " + getAdress());
    System.out.println("A data de cadastro do produto é: " + getPostDate());
  }

}
