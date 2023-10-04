public class Instituicao {
    protected String nome;
    protected String cnpj;

    public Instituicao(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Instituicao{" +
            "nome='" + nome + '\'' +
            ", cnpj='" + cnpj + '\'' +
            '}';
    }
}
