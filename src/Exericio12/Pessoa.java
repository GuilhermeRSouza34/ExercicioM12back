package Exericio12;

public abstract class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método abstrato para exibir informações específicas da pessoa
    public abstract void exibirDetalhes();
}
