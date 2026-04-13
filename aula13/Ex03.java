package aula13;
import java.util.Scanner;
public class Ex03 {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            System.out.println("Número digitado: " + numero);
        }catch(Exception e){
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
        }
        finally
        {
            System.out.println("Bloco finally executado");
            sc.close();
        }
        sc.close();
    
    }
}
