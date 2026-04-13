package aula13;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int op = -1;

        while (op != 0) {
            try {
                System.out.println("\n==Menu==");
                System.out.println("1. Adicionar item");
                System.out.println("2. Listar items");
                System.out.println("3. Remover item");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                op = sc.nextInt();
                sc.nextLine(); // Consumir a nova linha

                switch (op) {
                    case 1:
                        System.out.println("Digite o item para adicionar: ");
                        String item = sc.nextLine();
                        lista.add(item);
                        System.out.println("Item adicionado: " + item);
                        break;
                    case 2:
                        System.out.println("Items na lista:");
                        for (String i : lista) {
                            System.out.println("Lista: " +lista);
                        }
                        break;
                    case 3:
                        System.out.println("Digite o item para remover: ");
                        String itemRemover = sc.nextLine();
                        if (!lista.remove(itemRemover)) {
                            throw new Exception("Item não encontrado: " + itemRemover);
                        }
                        System.out.println("Item removido: " + itemRemover);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
        } catch(IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    
    }
}
}