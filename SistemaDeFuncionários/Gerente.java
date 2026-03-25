package SistemaDeFuncionários;

public class Gerente {
    private String nome;
    private int salarioBase;
    private int bonus;

    public Gerente(String nome, int salarioBase, int bonus) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonus = bonus;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase+this.bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    
    

    
}
