public class ClienteEngenharia extends ClientesDados {
  private String engineeringType;
  private String activityDescription;

  public String getEngineeringType() {
    return engineeringType;
  }

  public void setEngineeringType(String engineeringType) {
    this.engineeringType = engineeringType;
  }

  public String getActivityDescription() {
    return activityDescription;
  }

  public void setActivityDescription(String activityDescription) {
    this.activityDescription = activityDescription;
  }

  @Override
  public void returnClientType() {
    System.out.println("------------------------");
    System.out.println("INFORMAÇÕES DO CLIENTE:");
    System.out.println("O cliente é da área de Engenharia");
    System.out.println("O nome do cliente é: " + getName());
    System.out.println("O telefone do cliente é: " + getPhone());
    System.out.println("O endereço do cliente é: " + getAdress());
    System.out.println("A data de cadastro do produto é: " + getPostDate());
  }
}
