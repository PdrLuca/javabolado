package sfv;

public abstract class Funcionario {
    protected String nome;
    protected int salarioBase;

    public Funcionario(String nome, int salarioBase) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do funcionário não pode ser vazio.");
        }
        if (salarioBase < 0) {
            throw new IllegalArgumentException("O salário base do funcionário deve ser um valor positivo.");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario();
    public void exibir() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
        System.out.println("Salário Total: " + calcularSalario());
    }
    

    
}
