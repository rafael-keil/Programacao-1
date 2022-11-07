package jogador;

import clube.Clube;

public class Jogador {

    protected String nome;
    protected int idade;
    protected clube.Clube clubeAtual;
    protected int reputacaoHistorica;
    protected int apetiteFinanceiro;
    protected double preco;


    protected Jogador(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, double preco) {
        this.nome = nome;
        this.idade = idade;
        this.clubeAtual = clubeAtual;
        setReputacaoHistorica(reputacaoHistorica);
        setApetiteFinanceiro(apetiteFinanceiro);
        this.preco = preco;
    }

    public String getClubeAtual() {

        if (clubeAtual == null){
            return "Sem clube";
        } else {
            return clubeAtual.getNome();
        }

    }

    public void setClubeAtual(Clube clubeAtual) {
        this.clubeAtual = clubeAtual;
    }

    public void setReputacaoHistorica(int reputacaoHistorica) {
        this.reputacaoHistorica = Math.max(reputacaoHistorica, Math.min(reputacaoHistorica, 10));
    }

    public void setApetiteFinanceiro(int apetiteFinanceiro) {
        this.apetiteFinanceiro = Math.max(apetiteFinanceiro, Math.min(apetiteFinanceiro, 10));
    }

    public boolean estaInteressado(Clube clube){
        return clube.getReputacaoHistorica() > 0;
    }

    public Double valorDeCompra(){

        if(apetiteFinanceiro == 1){
            return preco;
        } else if(apetiteFinanceiro == 2){
            return preco * 1.4;
        } else {
            return preco *1.8;
        }

    }

}
