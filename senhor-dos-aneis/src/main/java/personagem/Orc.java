package personagem;

import classe.Guerreiro;
import raca.Monstro;

public class Orc extends Guerreiro implements Monstro {

    public Orc() {
        forca = 7;
        agilidade = 4;
        inteligencia = 1;
        constituicao = 30;
        sociedadeAnel = -1;
    }

    String grunido = "Arrrggghhh";

    @Override
    public String grunir() {
        return grunido;
    }

    @Override
    public String toString() {
        return "O";
    }

}
