import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Minicurso {
  private Date data;
  private Time horaInicio;
  private Time horaFim;
  private Professor professor;

  public Minicurso(Date data, Time horaInicio, Time horaFim) {
    this.data = data;
    this.horaInicio = horaInicio;
    this.horaFim = horaFim;
  }

  public Date getData() {
    return data;
  }

  public void setData(Date data) {
    this.data = data;
  }

  public Time getHoraInicio() {
    return horaInicio;
  }

  public void setHoraInicio(Time horaInicio) {
    this.horaInicio = horaInicio;
  }

  public Time getHoraFim() {
    return horaFim;
  }

  public void setHoraFim(Time horaFim) {
    this.horaFim = horaFim;
  }

  public void setProfessor(Professor professor){
    this.professor = professor;
  }

  @Override
  public String toString() {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy day"); 
    return "Minicurso{" +
        "data=" + formato.format(data) +
        ", horaInicio=" + horaInicio +
        ", horaFim=" + horaFim +
        '}';
  }
}

