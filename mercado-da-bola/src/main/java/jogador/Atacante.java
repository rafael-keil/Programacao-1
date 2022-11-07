package jogador;

import clube.Clube;

public class Atacante extends Jogador{

    int gols;

    public Atacante(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, double preco, int gols) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.gols = gols;
    }

    public Double valorDeCompra(){
        if(this.idade > 30){
            return (super.valorDeCompra() + super.valorDeCompra() * (gols * 0.01)) * 0.75;
        }
        return super.valorDeCompra() + super.valorDeCompra() * (gols * 0.01);
    }

    public boolean estaInteressado(Clube clube){
        return clube.getReputacaoHistorica() > this.reputacaoHistorica && super.estaInteressado(clube);
    }
}
