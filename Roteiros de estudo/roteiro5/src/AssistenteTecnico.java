public class AssistenteTecnico extends Assistente{

    private float bonus;

    public AssistenteTecnico(String nome, String endereco, String sexo, String contratacao, float salario, String espec, float bonus) {
        super(nome, endereco, sexo, contratacao, salario, espec);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    public void calculaSalario() {
        setSalarioF(getSalario() * bonus);
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "AssistenteTecnico{" +
                "bonus=" + bonus +
                '}';
    }
}
