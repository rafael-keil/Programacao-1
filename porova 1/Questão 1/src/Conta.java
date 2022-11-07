public class Conta {

    private String nome;
    private String email;
    private Filme f;

    public Conta(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Filme getF() {
        return f;
    }

    public void setF(Filme f) {
        this.f = f;
    }
}
