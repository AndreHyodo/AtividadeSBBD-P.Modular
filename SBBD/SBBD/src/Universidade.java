public class Universidade extends Instituicao {

  private String campus;

  public Universidade(String nome, String cnpj) {
    super(nome, cnpj);
  }

  public String getCampus() {
    return campus;
  }

  public void setCampus(String campus) {
    this.campus = campus;
  }

  @Override
  public String toString() {
    return "Universidade{" +
        "nome='" + nome + '\'' +
        ", cnpj='" + cnpj + '\'' +
        ", campus='" + campus + '\'' +
        '}';
  }
}

