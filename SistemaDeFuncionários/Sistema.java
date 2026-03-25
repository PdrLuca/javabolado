package SistemaDeFuncionários;

public class Sistema {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Carlos", 1600);
        Gerente g1 = new Gerente("Ana", 5000, 4000);
        Tecnico t1 = new Tecnico("Pedro", 4000, 1000);


        

        System.out.println("Sistema de Funcionários");
        System.out.println("-----------------------");
        System.out.println("Funcionário: " + f1.getNome() + ", Salário: " + f1.getSalarioBase());
        System.out.println("-----------------------");
        System.out.println("Gerente: " + g1.getNome() + ", Salário: " + (g1.getSalarioBase() + g1.getBonus()));
        System.out.println("-----------------------");
        System.out.println("Técnico: " + t1.getNome() + ", Salário: " + (t1.getSalarioBase() + t1.getAdicional()));
    }
    
}
