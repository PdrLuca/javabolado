package SistemaDeFuncionários;

public class Tecnico {
    private String nome;
    private int salarioBase;
    private int adicional;

    public Tecnico(String nome, int salarioBase, int adicional) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.adicional = adicional;
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
        this.salarioBase = salarioBase+this.adicional;
    }

    public int getAdicional() {
        return adicional;
    }

    public void setAdicional(int adicional) {
        this.adicional = adicional;
    }
    
}
