package Cadastro;

public class Aluno extends Cadastro {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCurso(String matricula) {
        this.matricula = matricula;
    }
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + matricula);
        System.out.println("---------------------------");
    }
}