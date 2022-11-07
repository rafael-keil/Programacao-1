import java.sql.SQLOutput;

public class Jogo {
    private String nome;
    private String plataforma;
    private int ano;

    public Jogo(String nome, String plataforma, int ano) {
        this.nome = nome;
        this.plataforma = plataforma;
        if(ano > 2021){
            System.out.println("Ano inválido.");
        }
        else{
            this.ano = ano;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 2021){
            System.out.println("Ano inválido.");
        }
        else{
            this.ano = ano;
        }
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", ano=" + ano +
                '}';
    }
}
