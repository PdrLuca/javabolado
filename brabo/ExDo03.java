import java.util.Scanner;

public class ExDo03 {
    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);

    do {
        System.out.println("Menu: ");
        System.out.println("1 -Cadastro");
        System.out.println("2 - Listar");
        System.out.println("3 - Excluir");
        System.out.println("4 - Sair");
        op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("cadastro de cliente");
                break;
            case 2:
                System.out.println("listar clientes");
                break;
            case 3:
                System.out.println("excluir cliente");
                break;
            case 4:
                System.out.println("Saindo do programa...");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    } while (op != 4);

    sc.close();
    }
}
