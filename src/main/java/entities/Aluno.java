package entities;

public class Aluno {
    private String nome;
    private Instrutor instrutor;
    private Treino treino;

    public Aluno(String nome, Instrutor instrutor, Treino treino) {
        this.nome = nome;
        this.instrutor = instrutor;
        this.treino = treino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Instrutor getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(Instrutor instrutor) {
        this.instrutor = instrutor;
    }

    public Treino getTreino() {
        return treino;
    }

    public void setTreino(Treino treino) {
        this.treino = treino;
    }
}
