package personagem;

import classe.Guerreiro;
import raca.Anao;

public class Gimli extends Guerreiro implements Anao {

    int bebado;

    public Gimli() {
        forca = 9;
        agilidade = 2;
        inteligencia = 4;
        constituicao = 60;
        sociedadeAnel = 1;
        bebado = 0;
    }

    @Override
    public void beber() {
        bebado++;
    }

    @Override
    public String falar() {
        if(bebado >= 2){
            return "What did I say? He can't hold his liquor!";
        } else{
            return "Let them come. There is one Dwarf yet in Moria who still draws breath.";
        }
    }

    @Override
    public String toString() {
        return "I";
    }
}
