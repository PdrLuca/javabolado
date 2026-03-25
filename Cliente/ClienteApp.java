package Cliente;

public class ClienteApp {
    public static void main(String[] args) {
        ClientePf c1 = new ClientePf(1, "João", "Rua A, 123", "123.456.789-00");
        ClientePj c2 = new ClientePj(2, "Empresa XYZ", "Avenida B, 456", "12.345.678/0001-00");

        System.out.println("Informações do Cliente Pessoa Física:");
        c1.exibirInfo();
        System.out.println("\nInformações do Cliente Pessoa Jurídica:");
        c2.exibirInfo();
    }
    
}
