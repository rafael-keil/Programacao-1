package clube;

public class Clube {

    private int reputacaoHistorica;
    private String nome;
    private double saldo;

    public Clube(int reputacaoHistorica, String nome, Double saldo) {
        setReputacaoHistorica(reputacaoHistorica);
        this.nome = nome;
        this.saldo = saldo;
    }

    public void setReputacaoHistorica(int reputacaoHistorica) {
        this.reputacaoHistorica = Math.max(0, Math.min(reputacaoHistorica, 10));
    }

    public double getSaldo() {
        return saldo;
    }

    public int getReputacaoHistorica() {
        return reputacaoHistorica;
    }

    public String getNome() {
        return nome;
    }

    public void atualizaSaldo(double compra){
        saldo -= compra;
    }

}
