public class App {
    public static void main(String[] args) throws Exception {
        ClienteComputacao clienteComp = new ClienteComputacao();
        ClienteAdministracao clienteAdm = new ClienteAdministracao();
        ClienteEngenharia clientEng = new ClienteEngenharia();

        // Configuração do Cliente Computação

        clienteComp.setName("Adeobaldo Pinto");
        clienteComp.setPhone("(71) 9 9273-7787");
        clienteComp.setAdress("Garibalde");
        clienteComp.setPostDate("29/10/2021");
        clienteComp.setProductName("CPU");
        clienteComp.setProductsData("Uma CPU i7 10th");
        clienteComp.setProductsPrice("1000.00");

        clienteComp.returnClientType();
        clienteComp.returnProductType();

        // Configuração do Cliente Administração

        clienteAdm.setName("Clodoaldo Moura");
        clienteAdm.setPhone("(71) 9 7962-6676");
        clienteAdm.setAdress("Pituba");
        clienteAdm.setPostDate("30/10/2021");
        clienteAdm.setProductName("Geladeira");
        clienteAdm.setProductsData("Uma geladeira eletrolux");
        clienteAdm.setProductsPrice("1500.00");

        clienteAdm.returnClientType();
        clienteAdm.returnProductType();

        // Configuração do Cliente Endengenharia

        clientEng.setName("Shiryu de Dragão");
        clientEng.setPhone("(71) 9 3617-1121");
        clientEng.setAdress("Alpha Ville");
        clientEng.setPostDate("08/11/2021");
        clientEng.setProductName("Óculos");
        clientEng.setProductsData("Óculos para olhos sensíveis ao sol");
        clientEng.setProductsPrice("900.00");

        clientEng.returnClientType();
        clientEng.returnProductType();
    }
}
