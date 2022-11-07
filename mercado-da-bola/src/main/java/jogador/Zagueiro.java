package jogador;

import clube.Clube;

public class Zagueiro extends Jogador{

    public Zagueiro(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, double preco) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
    }

    public Double valorDeCompra(){
        if(this.idade > 30){
            return super.valorDeCompra() * 0.8;
        }
        return super.valorDeCompra();
    }
}
