public class Filme {

    private String nome;
    private int ano;
    private Conta c;

    public Filme(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Conta getC() {
        return c;
    }

    public void setC(Conta c) {
        this.c = c;
    }
}
