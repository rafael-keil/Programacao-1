package personagem;

import classe.Guerreiro;
import mapa.Mapa;
import raca.Humano;

public class Boromir extends Guerreiro implements Humano {

    public Boromir() {
        forca = 7;
        agilidade = 6;
        inteligencia = 3;
        constituicao = 40;
        sociedadeAnel = 1;
    }

    @Override
    public String falar() {
        return "One does not simply walk into Mordor.";
    }

    @Override
    public void envelhecer(Mapa mapa) {
        this.receberDano(2, mapa);
    }

    @Override
    public String toString() {
        return "B";
    }

}
