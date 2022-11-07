package personagem;

import classe.Guerreiro;
import mapa.Mapa;
import raca.Humano;
import raca.Monstro;

public class Urukhai extends Guerreiro implements Monstro, Humano {

    public Urukhai() {
        forca = 8;
        agilidade = 6;
        inteligencia = 3;
        constituicao = 45;
        sociedadeAnel = -1;
    }

    @Override
    public String falar() {
        return "Looks like meat's back on the menu boys!";
    }

    @Override
    public void envelhecer(Mapa mapa) {
        this.receberDano(2, mapa);
    }

    @Override
    public String grunir() {
        return "Uuurrrrrr";
    }

    @Override
    public String toString() {
        return "U";
    }

}
