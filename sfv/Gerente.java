package sfv;

public class Gerente extends Funcionario {
    protected double bonus;

    public Gerente(String nome, int salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
    
}
