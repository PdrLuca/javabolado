package sfv;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPrincipal {
        public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Funcionario> lista = new ArrayList<>();
    
    try {
        System.out.println("Digite o nome do gerente:");
        String nomeGerente = sc.nextLine();

        System.out.println("Digite o salário base do gerente:");
        int salarioBaseGerente = sc.nextInt();

        lista.add(new Gerente(nomeGerente, salarioBaseGerente, 2000));

        System.out.println("Digite o nome do vendedor:");
        sc.nextLine(); // Consumir a quebra de linha pendente
        String nomeVendedor = sc.nextLine();

        System.out.println("Digite o salário base do vendedor:");
        int salarioBaseVendedor = sc.nextInt();

        System.out.println("Digite a comissão do vendedor:");
        double comissaoVendedor = sc.nextDouble();

        lista.add(new Vendedor(nomeVendedor, salarioBaseVendedor, comissaoVendedor));
    } catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("Erro ao ler os dados dos funcionários.");
    }
    for (Funcionario f : lista) {
        f.exibir();
    }
    sc.close();
}
}