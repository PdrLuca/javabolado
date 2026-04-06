package Cadastro;

public class Professor extends Cadastro {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("---------------------------");
    }
    
}
