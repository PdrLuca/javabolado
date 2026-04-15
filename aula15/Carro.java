public class Carro extends Veiculo {

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public double calcularValor() {
        // Exemplo de cálculo de valor para um carro
        return 30000.0; // Valor fixo para simplificação
    }

}
