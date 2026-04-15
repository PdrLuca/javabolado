public class Moto extends Veiculo {

    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }
    
    @Override
    public double calcularValor() {
        // Exemplo de cálculo de valor para uma moto
        return 15000.0; // Valor fixo para simplificação
    }
}
