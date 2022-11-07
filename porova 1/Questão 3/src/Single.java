import java.util.Objects;

public class Single extends Quarto{

    private String nome;

    public Single(int numero, boolean vago, int estadia, String nome) {
        super(numero, vago, estadia);
        this.nome = nome;
    }

    public Single(Quarto quarto, String nome) {
        super(quarto.getNumero(), quarto.isVago(), quarto.getEstadia());
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return super.toString() +  "Single{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
