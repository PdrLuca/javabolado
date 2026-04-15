public abstract class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        if (modelo.isEmpty()) {
            throw new IllegalArgumentException("O modelo do veículo não pode ser vazio.");
        }
        if (ano < 2000) {
            throw new IllegalArgumentException("O ano do veículo deve ser 2000 ou posterior.");
        }
        this.modelo = modelo;
        this.ano = ano;
    }
    public abstract double calcularValor();

    public void exibir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: " + calcularValor());
    }
}