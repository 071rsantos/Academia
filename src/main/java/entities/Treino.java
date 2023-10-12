package entities;

public class Treino {
    private String tipo;
    private String grupamento;

    public Treino(String tipo, String grupamento) {
        this.tipo = tipo;
        this.grupamento = grupamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getExercicio() {
        return grupamento;
    }

    public void setExercicio(String exercicio) {
        this.grupamento = exercicio;
    }
}
