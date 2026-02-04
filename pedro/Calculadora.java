import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe N1 ");
        double n1 = sc.nextDouble();

        System.out.println("Informe N2 ");
        double n2 = sc.nextDouble();

        double soma = n1 + n2;
        double sub = n1 - n2;
        double mult = n1 * n2;
        double div = n1 / n2;
        
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + sub);
        System.out.println("Multiplicação: " + mult);
        System.out.println("Divisão: " + div);
        
        sc.close();
    }
}
