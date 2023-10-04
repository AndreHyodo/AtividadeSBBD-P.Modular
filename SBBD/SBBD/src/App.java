import java.util.List;

public class App {
  public static void main(String[] args) {
    // Criar uma instância da classe Professores
    Professores professores = Professores.getInstance();

    // Adicionar um professor à coleção
    professores.adicionarProfessor(new Professor("João da Silva", "joao.silva@email.com", "123.456.789-00", "Banco de Dados"));

    // Remover um professor da coleção
    professores.removerProfessor(professores.pesquisarProfessorPorCpf("123.456.789-00"));

    // Pesquisar um professor pelo CPF
    Professor professor = professores.pesquisarProfessorPorCpf("123.456.789-00");

    // Listar todos os professores
    List<Professor> professoresLista = professores.listarProfessores();

    // Imprimir o nome de todos os professores
    for (Professor professorLista : professoresLista) {
      System.out.println(professorLista.getNome());
    }

    // Criar uma instância da classe Universidade
    Universidade universidade = new Universidade("Universidade de São Paulo", "123.456.789/0001-99");

    // Imprimir o nome da universidade
    System.out.println(universidade.getNome());
  }
}
