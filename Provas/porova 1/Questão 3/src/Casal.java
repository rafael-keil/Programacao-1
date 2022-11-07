public class Casal extends Quarto{

    private String nome1;
    private String nome2;

    public Casal(int numero, boolean vago, int estadia, String nome1, String nome2) {
        super(numero, vago, estadia);
        this.nome1 = nome1;
        this.nome2 = nome2;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getNome1() {
        return nome1;
    }

    public String getNome2() {
        return nome2;
    }

    @Override
    public String toString() {
        return super.toString() + "Casal{" +
                "nome1='" + nome1 + '\'' +
                ", nome2='" + nome2 + '\'' +
                '}';
    }
}
