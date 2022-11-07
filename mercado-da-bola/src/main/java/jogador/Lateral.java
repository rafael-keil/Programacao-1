package jogador;

import clube.Clube;

public class Lateral extends Jogador{

    int cruzamentoCerteiro;

    public Lateral(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, double preco, int cruzamentoCerteiro) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.cruzamentoCerteiro = cruzamentoCerteiro;
    }

    public Double valorDeCompra(){
        if(this.idade > 28){
            return (super.valorDeCompra() + super.valorDeCompra() * (cruzamentoCerteiro * 0.02)) * 0.7;
        }
        return super.valorDeCompra() + super.valorDeCompra() * (cruzamentoCerteiro * 0.02);
    }
}
