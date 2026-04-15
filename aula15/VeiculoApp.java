
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.IllegalArgumentException;

public class VeiculoApp {
      
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      ArrayList<Veiculo> lista = new ArrayList<>();

      try {
        System.out.println("Digite o modelo do carro:");
        String modeloCarro = sc.nextLine();

        System.out.println("Digite o ano do carro:");
        int anoCarro = sc.nextInt();

        lista.add(new Carro(modeloCarro, anoCarro));
      } catch (InputMismatchException e) {
        System.out.println("Erro: Digite um número válido para o ano do carro.");
      } catch (IllegalArgumentException e) {
        System.out.println("Erro: " + e.getMessage());
      } catch (Exception e) {
        System.out.println("Erro ao ler os dados do carro.");
      }
      for (Veiculo v : lista) {
        v.exibir();
    
        
    }
}
}