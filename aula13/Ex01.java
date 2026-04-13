package aula13;
public class Ex01 {
    public static void main(String []args) {
        int  a=10;
        int b=0;

        try{
            int resultado = a/b;
            System.out.println("Resultado: " + resultado);
        }catch(ArithmeticException e){
            System.out.println("Erro: ");
        }
        finally
        {
            System.out.println("Bloco finally executado");
        }


    }
    
}
