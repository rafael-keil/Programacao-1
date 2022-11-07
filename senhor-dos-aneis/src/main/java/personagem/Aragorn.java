package personagem;

import classe.Guerreiro;
import mapa.Mapa;
import raca.Humano;

public class Aragorn extends Guerreiro implements Humano {

    public Aragorn() {
        forca = 10;
        agilidade = 7;
        inteligencia = 6;
        constituicao = 60;
        sociedadeAnel = 1;
    }

    String fala = "A day may come when the courage of men fails… but it is not THIS day.";

    @Override
    public String falar() {
        return fala;
    }

    @Override
    public void envelhecer(Mapa mapa) {
        this.receberDano(1, mapa);
    }

    @Override
    public String toString() {
        return "A";
    }

}
