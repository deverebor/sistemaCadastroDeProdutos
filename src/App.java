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
        clienteComp.setTech("Hardware company");
        clienteComp.setCompanyDescription("Uma empresa de construção e manutenção de hardwares.");

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
        clienteAdm.setConsultType("Qual a melhor forma de investir na minha empresa");
        clienteAdm.setConsultData(
                "Estou com dúvida da melhor forma de investir meu dinheiro na minha empresa, quais passos seguir ?");

        clienteAdm.setProductName("Consulta básica no plano da empresa");
        clienteAdm.setProductsData("Como construir um negócio de sucesso");
        clienteAdm.setProductsPrice("1500.00");

        clienteAdm.returnClientType();
        clienteAdm.returnProductType();

        // Configuração do Cliente Endengenharia

        clientEng.setName("Shiryu de Dragão");
        clientEng.setPhone("(71) 9 3617-1121");
        clientEng.setAdress("Alpha Ville");
        clientEng.setPostDate("08/11/2021");
        clientEng.setEngineeringType("Engenheiro Civil");
        clientEng.setActivityDescription("Construtor de prédios.");

        clientEng.setProductName("Manutenção em uma construção.");
        clientEng.setProductsData("Revisão no prédio.");
        clientEng.setProductsPrice("900.00");

        clientEng.returnClientType();
        clientEng.returnProductType();
    }
}
