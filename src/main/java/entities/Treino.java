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

    public String getGrupamento() {
        return String.format(grupamento);
    }

    public void setGrupamento(String grupamento) {
        this.grupamento = grupamento;
    }

    @Override
    public String toString() {
        return String.format("%s", getTipo());
    }
}
