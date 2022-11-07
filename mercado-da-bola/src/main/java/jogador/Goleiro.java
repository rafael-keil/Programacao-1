package jogador;

import clube.Clube;

public class Goleiro extends Jogador{

    int penaltisDefendidos;

    public Goleiro(String nome, int idade, Clube clubeAtual, int reputacaoHistorica, int apetiteFinanceiro, double preco, int penaltisDefendidos) {
        super(nome, idade, clubeAtual, reputacaoHistorica, apetiteFinanceiro, preco);
        this.penaltisDefendidos = penaltisDefendidos;
    }

    public Double valorDeCompra(){
        return super.valorDeCompra() + super.valorDeCompra() * (penaltisDefendidos * 0.04);
    }
}
