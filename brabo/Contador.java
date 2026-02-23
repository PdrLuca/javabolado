

public class Contador {
    public static void main(String[] args) {
        int contador = 1;

        System.out.println("Iniciando o contador em do-while: ");

        do {
            System.out.println("Contador: " + contador);
            contador++;
        } while (contador <= 5);

        System.out.println("Fim de laço: ");
        }
    }