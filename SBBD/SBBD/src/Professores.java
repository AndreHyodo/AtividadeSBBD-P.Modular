import java.util.ArrayList;
import java.util.List;

public class Professores {
    private static Professores instance = null;
    private List<Professor> professores;

    private Professores() {
        this.professores = new ArrayList<>();
    }

    public static Professores getInstance() {
        if (instance == null) {
        instance = new Professores();
        }
        return instance;
    }

    public void adicionarProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void removerProfessor(Professor professor) {
        this.professores.remove(professor);
    }

    public Professor pesquisarProfessorPorCpf(String cpf) {
        for (Professor professor : this.professores) {
        if (professor.getCpf().equals(cpf)) {
            return professor;
        }
        }
        return null;
    }

    public List<Professor> listarProfessores() {
        return this.professores;
    }
}
