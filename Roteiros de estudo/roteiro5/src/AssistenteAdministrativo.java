public class AssistenteAdministrativo extends Assistente{

    private String turno;
    private int[] i;


    public AssistenteAdministrativo(String nome, String endereco, String sexo, String contratacao, float salario, String espec, String turno, int[] i) {
        super(nome, endereco, sexo, contratacao, salario, espec);
        this.turno = turno;
        this.i = i;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public void calculaSalario() {
        if(turno == "n"){
            setSalarioF(getSalario() + 500);
        }
        else{
            setSalarioF(getSalario());
        }
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "AssistenteAdministrativo{" +
                "turno='" + turno + '\'' +
                '}';
    }
}
