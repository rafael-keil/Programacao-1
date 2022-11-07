package personagem;

import classe.Mago;
import classe.Personagem;
import raca.Maia;

public class Saruman extends Mago implements Maia {

    public Saruman() {
        forca = 2;
        agilidade = 2;
        inteligencia = 9;
        constituicao = 70;
        sociedadeAnel = -1;
    }

    @Override
    public String falar() {
        return "Against the power of Mordor there can be no victory.";
    }

    @Override
    public Personagem ressuscitar() {
        return null;
    }

    @Override
    public String toString() {
        return "S";
    }

}
