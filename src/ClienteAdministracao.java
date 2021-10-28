public class ClienteAdministracao extends ClientesDados {
  private String consultType;
  private String consultData;

  public String getConsultType() {
    return this.consultType;
  }

  public void setConsultType(String consultType) {
    this.consultType = consultType;
  }

  public String getConsultData() {
    return this.consultData;
  }

  public void setConsultData(String consultData) {
    this.consultData = consultData;
  }

  @Override
  public void returnClientType() {
    System.out.println("------------------------");
    System.out.println("INFORMAÇÕES DO CLIENTE:");
    System.out.println("O cliente é da área de Administração");
    System.out.println("O nome do cliente é: " + getName());
    System.out.println("O telefone do cliente é: " + getPhone());
    System.out.println("O endereço do cliente é: " + getAdress());
    System.out.println("A data de cadastro do produto é: " + getPostDate());
  }
}
