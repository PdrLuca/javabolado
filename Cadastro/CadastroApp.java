package Cadastro;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastroApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cadastro> lista = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("5 - Pesquisar");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1: // CADASTRAR
                    System.out.println("1 - Aluno | 2 - Professor");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nome:  ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Matrícula: ");
                        String matricula = sc.nextLine();
                        lista.add(new Aluno(nome, idade, matricula));
                    } else {
                        System.out.print("Disciplina: ");
                        String disciplina = sc.nextLine();
                        lista.add(new Professor(nome, idade, disciplina));
                    }
                    break;

                case 2: // LISTAR
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("Índice: " + i);
                        lista.get(i).exibirDados();
                    }
                    break;

                case 3: // ALTERAR
                    System.out.print("Informe o índice: ");
                    int iAlt = sc.nextInt();
                    sc.nextLine();

                    if (iAlt >= 0 && iAlt < lista.size()) {
                        Cadastro c = lista.get(iAlt);

                        System.out.print("Novo nome: ");
                        c.setNome(sc.nextLine());

                        System.out.print("Nova idade: ");
                        c.setIdade(sc.nextInt());
                        sc.nextLine();

                        if (c instanceof Aluno) {
                            System.out.print("Nova matrícula: ");
                            String matriculaNova = sc.nextLine();
                            lista.set(iAlt, new Aluno(c.getNome(), c.getIdade(), matriculaNova));
                        } else if (c instanceof Professor) {
                            System.out.print("Nova disciplina: ");
                            String disciplinaNova = sc.nextLine();
                            lista.set(iAlt, new Professor(c.getNome(), c.getIdade(), disciplinaNova));
                        }
                    }
                    break;

                case 4: // REMOVER
                    System.out.print("Informe o índice: ");
                    int iRem = sc.nextInt();
                    sc.nextLine();

                    if (iRem >= 0 && iRem < lista.size()) {
                        lista.remove(iRem);
                        System.out.println("Removido com sucesso!");
                    }
                    break;

                case 5: // PESQUISAR
                    System.out.print("Nome para busca: ");
                    String busca = sc.nextLine();

                    for (Cadastro c : lista) {
                        if (c.getNome().equalsIgnoreCase(busca)) {
                            c.exibirDados();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
