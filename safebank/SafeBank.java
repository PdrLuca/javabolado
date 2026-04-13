package safebank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeBank {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao SafeBank!");
        
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0; 
        
        try {
            System.out.print("Digite o valor do saque: ");
            double valorSaque = scanner.nextDouble();
            
            if (valorSaque <= 0) {
                throw new IllegalArgumentException("Valor do saque deve ser positivo.");
            }
            
            if (valorSaque > saldo) {
                throw new IllegalArgumentException("Saldo insuficiente para o saque.");
            }
            
           
            
            saldo -= valorSaque;
            System.out.println("Saque realizado com sucesso. Saldo restante: " + saldo);
            
        } catch (InputMismatchException e) {
            System.out.println("Erro de digitação: entrada inválida. Digite um número válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("Operação encerrada");
            scanner.close();
        }
    }
}
