package Exericio12;

public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String nome, String cnpj, String razaoSocial) {
        super(nome);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Pessoa Jurídica:");
        System.out.println("Nome: " + getNome());
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razão Social: " + razaoSocial);
    }
}
