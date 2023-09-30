package Exericio12;

public class PessoaFisica extends Pessoa {
    private String cpf;
    private int idade;

    public PessoaFisica(String nome, String cpf, int idade) {
        super(nome);
        this.cpf = cpf;
        this.idade = idade;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pessoa Física:");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}