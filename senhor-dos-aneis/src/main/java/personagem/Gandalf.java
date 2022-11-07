package personagem;

import classe.Mago;
import classe.Personagem;
import raca.Maia;

public class Gandalf extends Mago implements Maia {

    public Gandalf() {
        forca = 2;
        agilidade = 3;
        inteligencia = 10;
        constituicao = 80;
        sociedadeAnel = 1;
    }

    @Override
    public String falar() {
        return "A Wizard is never late, nor is he early. He arrives precisely when he means to.";
    }

    @Override
    public Personagem ressuscitar() {
        return new Gandalf();
    }

    @Override
    public String toString() {
        return "G";
    }
}
