public abstract class Funcionario {

    private String nome;
    private String endereco;
    private String sexo;
    private String contratacao;
    private float salario;
    private float salarioF;

    public Funcionario() {

    }

    public Funcionario(String nome, String endereco, String sexo, String contratacao, float salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.contratacao = contratacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getContratacao() {
        return contratacao;
    }

    public void setContratacao(String contratacao) {
        this.contratacao = contratacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getSalarioF() {
        return salarioF;
    }

    public void setSalarioF(float salarioF) {
        this.salarioF = salarioF;
    }

    public abstract void calculaSalario();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", sexo='" + sexo + '\'' +
                ", contratacao='" + contratacao + '\'' +
                ", salario=" + salario +
                ", salarioF=" + salarioF +
                '}';
    }
}
