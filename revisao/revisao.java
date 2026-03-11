import java.util.Scanner;

public class revisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] onibus = new int[4];
        int opcao;

        int[] assentos = new int[4];
        int quantidadeAssentos;



        while(true) {
            System.out.println("1 - Registrar o número de ônibus");
            System.out.println("2 -Registrar o quantitativo de assentos disponiveis em cada ônibus");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar por ônibus");
            System.out.println("5 - Consultar por passageiro");
            System.out.println("6 - Encerrar");

            opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        for (int i = 0; i < onibus.length; i++) {
                            System.out.print("Digite o número do ônibus: ");
                            onibus[i] = sc.nextInt();
                        }
                        break;

                    case 2:
                        for (int i = 0; i < onibus.length; i++) {
                            System.out.print("Digite o número de assentos disponíveis para o ônibus " + onibus[i] + ": ");
                            assentos[i] = sc.nextInt();
                        }
                        break;

                    case 3:
                        System.out.print("Digite o número do ônibus para reservar a passagem: ");
                        int numeroOnibus = sc.nextInt();
                        boolean encontrado = false;

                        for (int i = 0; i < onibus.length; i++) {
                            if (onibus[i] == numeroOnibus) {
                                encontrado = true;
                                if (assentos[i] > 0) {
                                    assentos[i]--;
                                    System.out.println("Passagem reservada para o ônibus " + numeroOnibus);
                                } else {
                                    System.out.println("Não há assentos disponíveis para o ônibus " + numeroOnibus);
                                }
                                break;
                            }
                        }


                    case 4:
                        System.out.print("Digite o número do ônibus para consultar: ");
                        int numeroOnibusConsulta = sc.nextInt();
                        boolean encontradoOnibus = false;
                        for (int i = 0; i < onibus.length; i++) {
                            if (onibus[i] == numeroOnibusConsulta) {
                                encontradoOnibus = true;
                                System.out.println("Ônibus " + numeroOnibusConsulta + " - Assentos disponíveis: " + assentos[i]);
                                break;
                            }
                        }
                        if (!encontradoOnibus) {
                            System.out.println("Ônibus não encontrado.");
                        }
                        break;

                    case 5:
                        System.out.print("Digite o nome do passageiro para consultar: ");
                        String nomePassageiro = sc.next();
                        boolean encontradoPassageiro = false;

                        
                        if (!encontradoPassageiro) {
                            System.out.println("Passageiro não encontrado.");
                        }
                        break;
                
                    case 6:
                        System.out.println("Encerrando o programa.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;

            
            }
        }
    }
}
