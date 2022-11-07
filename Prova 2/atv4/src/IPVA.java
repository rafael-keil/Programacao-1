public abstract class IPVA {

    String nome;
    String placa;
    double valor;
    int ano;

    public IPVA(String nome, String placa, double valor, int ano) {
        this.nome = nome;
        this.placa = placa;
        this.valor = valor;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double calculaImposto(){
        return 0;
    }
}
