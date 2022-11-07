import java.util.Arrays;

public class Programador extends Funcionario{

    private String linguagem[] = new String[3];
    private int data[] = new int [3];

    public Programador(String nome, String codigo) {
        super(nome, codigo);
    }

    public String[] getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String[] linguagem) {
        this.linguagem = linguagem;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return super.toString() + " Programador{" +
                "linguagem=" + Arrays.toString(linguagem) +
                ", data=" + Arrays.toString(data) +
                '}';
    }

}
