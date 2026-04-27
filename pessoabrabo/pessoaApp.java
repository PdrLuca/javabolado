package Pessoabrabo;


public class PessoaApp {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Jõao", 25);
        Pessoa p2 = new Pessoa("Maria", 30);

        System.out.println("O nome da pessoa é "+p1.getNome());
        System.out.println("A idade da pessoa é "+p1.getIdade());

        p1.setNome("Carlos");
        p1.setIdade(35);

        System.out.println("O nome da pessoa é "+p1.getNome());
        System.out.println("A idade da pessoa é "+p1.getIdade());

        p2.setNome("Ana");
        p2.setIdade(28);

        System.out.println("O nome da pessoa é "+p2.getNome());
        System.out.println("A idade da pessoa é "+p2.getIdade());
    }
    
}
