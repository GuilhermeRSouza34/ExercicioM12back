package Exericio12;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("João", "123.456.789-00", 30);
        pessoaFisica.exibirDetalhes();

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "12345678901234", "Empresa XYZ LTDA");
        pessoaJuridica.exibirDetalhes();
    }
}

