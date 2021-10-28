public class App {
    public static void main(String[] args) throws Exception {
        ClienteComputacao clienteComput = new ClienteComputacao();
        ClienteAdministracao clienteAdm = new ClienteAdministracao();
        ClienteEngenharia clientEng = new ClienteEngenharia();

        // Configuração do Cliente Computação

        clienteComput.setName("Adeobaldo Pinto");
        clienteComput.setPhone("(71) 9 9184-8898");
        clienteComput.setAdress("Garibalde");
        clienteComput.setPostDate("29/10/2021");
        clienteComput.setProductName("CPU");
        clienteComput.setProductsData("Uma CPU i7 10th");
        clienteComput.setProductsPrice("1000.00");

        clienteComput.returnClientType();
        clienteComput.returnProductType();

        // Configuração do Cliente Administração

        clienteAdm.setName("Adeobaldo Pinto");
        clienteAdm.setPhone("(71) 9 9184-8898");
        clienteAdm.setAdress("Garibalde");
        clienteAdm.setPostDate("29/10/2021");
        clienteAdm.setProductName("CPU");
        clienteAdm.setProductsData("Uma CPU i7 10th");
        clienteAdm.setProductsPrice("1000.00");

        clienteAdm.returnClientType();
        clienteAdm.returnProductType();

        // Configuração do Cliente Endengenharia

        clientEng.setName("Adeobaldo Pinto");
        clientEng.setPhone("(71) 9 9184-8898");
        clientEng.setAdress("Garibalde");
        clientEng.setPostDate("29/10/2021");
        clientEng.setProductName("CPU");
        clientEng.setProductsData("Uma CPU i7 10th");
        clientEng.setProductsPrice("1000.00");

        clientEng.returnClientType();
        clientEng.returnProductType();
    }
}
