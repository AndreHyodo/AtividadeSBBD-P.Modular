import java.util.List;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {

  private static List<SessaoTecnica> sessoesTecnicas;
  private static List<Minicurso> minicursos;
  
  public static void main(String[] args) throws ParseException {
    Scanner in = new Scanner(System.in);

    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
    DateFormat formatterTime = new SimpleDateFormat("HH:mm");

    System.out.println(" Simposio Brasileiro de Banco de Dados");
    System.out.println("1 - Adicionar Professor \n2 - Adicionar Minicurso\n3 - Adicionar Sessao Tecnica\n4 - Imprimir Sessões Técnicas\n5 - Imprimir Minicursos\n6 - Imprimir lista de Professores\n7- Pesquisar Professor por cpf.");
    int i = in.nextInt();

    Professores professores = Professores.getInstance();
    List<Professor> professoresLista = professores.listarProfessores();

    switch (i){
      case 1:
        System.out.println("Digite o nome do professor: ");
        String nomeProfessor = in.next();
        System.out.println("Digite o email do professor: ");
        String emailProfessor = in.next();
        System.out.println("Digite o cpf do professor: ");
        String cpfProfessor = in.next();
        System.out.println("Digite a disciplina do professor: ");
        String disciplinaProfessor = in.next();
        
        professores.adicionarProfessor(new Professor(nomeProfessor, emailProfessor, cpfProfessor, disciplinaProfessor));     

        break;
      case 2:
        System.out.println("Digite a data do curso: ");
        String stringData = in.next();
        Date dataCurso = formatter.parse(stringData);

        System.out.println("Digite o horário de inicio do curso: ");
        String horaInicioString = in.next();
        Time timeValue = new java.sql.Time(formatterTime.parse(horaInicioString).getTime());

        System.out.println("Digite o horário de término do curso: ");
        String horaFinalString = in.next();
        Time timeValueFinal = new java.sql.Time(formatterTime.parse(horaFinalString).getTime());
        
        
        
        Minicurso minicurso1 = new Minicurso(dataCurso, timeValue, timeValueFinal);
        System.out.println("Cadastrado: " + minicurso1.toString());

        minicursos.add(new Minicurso(dataCurso, timeValue, timeValueFinal));
        break;

      case 3:
        System.out.println("Digite a data da Sessão Técnica: ");
        String stringDataSessao = in.next();
        Date dataSessao = formatter.parse(stringDataSessao);

        System.out.println("Digite o horário de inicio do curso: ");
        String horaInicioStringSessao = in.next();
        Time timeValueSessao = new java.sql.Time(formatterTime.parse(horaInicioStringSessao).getTime());

        System.out.println("Digite o horário de término do curso: ");
        String horaFinalStringSessao = in.next();
        Time timeValueFinalSessao = new java.sql.Time(formatterTime.parse(horaFinalStringSessao).getTime());
        
        
        
        SessaoTecnica sessaoTecnica = new SessaoTecnica(dataSessao, timeValueSessao, timeValueFinalSessao);
        System.out.println("Cadastrado: " + sessaoTecnica.toString());

        sessoesTecnicas.add(new SessaoTecnica(dataSessao, timeValueSessao, timeValueFinalSessao));
          
        break;
      case 4:
        int n = sessoesTecnicas.size();
        for (int a=0; a< n ; a++) {
          sessoesTecnicas.get(a).toString();
        }
          
        break;
      case 5:
        int m = minicursos.size();
        for (int a=0; a< m ; a++) {
          minicursos.get(a).toString();
        }
          
        break;
      case 6:
        int l = professoresLista.size();
        for (int a=0; a< l ; a++) {
          System.out.println(professoresLista.get(a).getNome());
        }
          
        break;
      case 7:
        System.out.println("Digite o cpf que deseja pesquisar: ");
        String cpfPesquisa = in.next();

        Professor professorCpf = professores.pesquisarProfessorPorCpf(cpfPesquisa);
        System.out.println("O professor de cpf "+ professorCpf.getCpf()+ " é: "+ professorCpf.getNome());

    }   

    in.close();
  }

}
