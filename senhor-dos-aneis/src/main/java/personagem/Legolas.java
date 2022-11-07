package personagem;

import classe.Arqueiro;
import raca.Elfo;

public class Legolas extends Arqueiro implements Elfo {

    public Legolas() {
        forca = 5;
        agilidade = 10;
        inteligencia = 6;
        constituicao = 80;
        sociedadeAnel = 1;
    }

    @Override
    public String falar() {
        return "They're taking the Hobbits to Isengard!";
    }

    @Override
    public String falarElfico() {
        return "I amar prestar aen, han mathon ne nem, han mathon ne chae, a han noston ned.";
    }

    @Override
    public String toString() {
        return "L";
    }

}
