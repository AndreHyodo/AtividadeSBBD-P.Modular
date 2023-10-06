import java.util.List;
import java.util.Locale;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class App {
  public static void main(String[] args) throws ParseException {
    Scanner in = new Scanner(System.in);
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    DateFormat formatterTime = new SimpleDateFormat("HH:mm");

    Professores professores = Professores.getInstance();

    professores.adicionarProfessor(new Professor("João da Silva", "joao.silva@email.com", "123.456.789-00", "Banco de Dados"));
    professores.adicionarProfessor(new Professor("Carlos Santos", "carlos.santos@email.com", "987.654.321-00", "Banco de Dados"));

    // Remover um professor da coleção
    // professores.removerProfessor(professores.pesquisarProfessorPorCpf("123.456.789-00"));

    System.out.println("Digite a data do curso: ");
    String stringData = in.nextLine();
    Date dataCurso = formatter.parse(stringData);

    System.out.println("Digite o horário de inicio do curso: ");
    String horaInicioString = in.nextLine();
    Time timeValue = new java.sql.Time(formatterTime.parse(horaInicioString).getTime());

    Minicurso minicurso1 = new Minicurso(dataCurso, timeValue, timeValue);

    System.out.println("Cadastrado: " + minicurso1.toString());
    
    Professor professor = professores.pesquisarProfessorPorCpf("123.456.789-00");
    System.out.println("O professor de cpf "+ professor.getCpf()+ " é: "+ professor.getNome());

    List<Professor> professoresLista = professores.listarProfessores();
    
    int n = professoresLista.size();

    for (int i=0; i< n ; i++) {
      System.out.println(professoresLista.get(i).getNome());
    }

    Universidade universidade = new Universidade("Universidade de São Paulo", "123.456.789/0001-99");

    System.out.println(universidade.getNome());

    in.close();
  }
}
