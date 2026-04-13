package aula13;
public class Ex02 {
    public static void main(String []args) {
        int[] numeros = {10, 20, 30};

        try{
            System.out.println(numeros[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: Índice fora do array");
        }
        finally
        {
            System.out.println("Bloco finally executado");

    
        }
    }
}