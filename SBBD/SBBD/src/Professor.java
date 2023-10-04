public class Professor extends Pessoa {

  private String disciplina;

  public Professor(String nome, String email, String cpf, String disciplina) {
    super(nome, email, cpf);
    this.disciplina = disciplina;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  @Override
  public String toString() {
    return "Professor{" +
        "nome='" + nome + '\'' +
        ", email='" + email + '\'' +
        ", cpf='" + cpf + '\'' +
        ", disciplina='" + disciplina + '\'' +
        '}';
  }
}
