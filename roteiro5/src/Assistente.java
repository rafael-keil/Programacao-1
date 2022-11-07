public abstract class Assistente extends Funcionario{

    private String espec;

    public Assistente() {

    }

    public Assistente(String nome, String endereco, String sexo, String contratacao, float salario, String espec) {
        super(nome, endereco, sexo, contratacao, salario);
        this.espec = espec;
    }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    @Override
    public abstract void calculaSalario();

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "Assistente{" +
                "espec='" + espec + '\'' +
                '}';
    }
}
