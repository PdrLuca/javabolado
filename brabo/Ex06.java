import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for(int i=1;i<=3;i++) {
            System.out.println("informe o nome "+i);
            String nome = sc.nextLine();

            System.out.println("Nome informado: " + nome);


        }
        sc.close();
    }
    
}
