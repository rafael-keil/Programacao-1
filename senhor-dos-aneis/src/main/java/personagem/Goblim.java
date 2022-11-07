package personagem;

import classe.Arqueiro;
import raca.Monstro;

public class Goblim extends Arqueiro implements Monstro {

    public Goblim() {
        forca = 3;
        agilidade = 6;
        inteligencia = 1;
        constituicao = 20;
        sociedadeAnel = -1;
    }

    @Override
    public String grunir() {
        return "Iiisshhhh";
    }

    @Override
    public String toString() {
        return "M";
    }

}
