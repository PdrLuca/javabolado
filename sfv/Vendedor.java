package sfv;

public class Vendedor extends Funcionario {
    protected double comissao;

    public Vendedor(String nome, int salarioBase, double comissao) {
        super(nome, salarioBase);
        if (comissao < 0) {
            throw new IllegalArgumentException("A comissão do vendedor deve ser um valor positivo.");
        }
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
    
}
