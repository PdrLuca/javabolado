


public class Carro {
    public static void main(String[] args) {
        // Imagine que você foi contratado para desenvolver um projeto para manipular objetos do tipo Carro em java. Desenvolva a solução utilizando os conceitos de orientação a objetos e encapsulamento, sabendo que a classe Carro deve contar os atributos: 
        // -marca 
        // -modelo 
        // -anoFabricacao.
        // Criar a classe CarroApp baseado na classe PessoaApp para instanciar dois objetos do tipo carro.

        Carro c1 = new Carro("Toyota", "Corolla", 2020);
        Carro c2 = new Carro("Honda", "Civic", 2019);

        System.out.println("A marca do carro é "+c1.getMarca());
        System.out.println("O modelo do carro é "+c1.getModelo());
        System.out.println("O ano de fabricação do carro é "+c1.getAnoFabricacao());
        
        c1.setMarca("Ford");
        c1.setModelo("Focus");  
        c1.setAnoFabricacao(2021);

        System.out.println("A marca do carro é "+c1.getMarca());
        System.out.println("O modelo do carro é "+c1.getModelo());
        System.out.println("O ano de fabricação do carro é "+c1.getAnoFabricacao());
        System.out.println("A marca do carro é "+c2.getMarca());
        System.out.println("O modelo do carro é "+c2.getModelo());
        System.out.println("O ano de fabricação do carro é "+c2.getAnoFabricacao());
        c2.setMarca("Chevrolet");
        System.out.println("A marca do carro é "+c2.getMarca());
        System.out.println("O modelo do carro é "+c2.getModelo());
        System.out.println("O ano de fabricação do carro é "+c2.getAnoFabricacao());






    }
    
}

