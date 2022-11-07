public class Gerente extends Funcionario{

    private String nivel;

    public Gerente(String nome, String endereco, String sexo, String contratacao, float salario, String nivel) {
        super(nome, endereco, sexo, contratacao, salario);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public void calculaSalario() {
        setSalarioF(getSalario());
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "Gerente{" +
                "nivel='" + nivel + '\'' +
                '}';
    }
}
