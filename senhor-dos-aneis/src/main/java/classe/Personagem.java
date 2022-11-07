package classe;

import mapa.Mapa;

public abstract class Personagem {

    protected int forca;
    protected int agilidade;
    protected int inteligencia;
    protected int constituicao;
    protected int sociedadeAnel;
    protected int turno;


    public int getConstituicao() {
        return constituicao;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getSociedadeAnel() {
        return sociedadeAnel;
    }

    public int getTurno() {
        return turno;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void receberDano(int dano, Mapa mapa){
        if(this.constituicao <= dano){
            this.constituicao = 0;
            mapa.getMap().remove(mapa.buscarPosicao(this));
        } else {
            this.constituicao -= dano;
        }

    }

    public void atacar(Mapa mapa){

    }

    public void movimentar(Mapa mapa){

    }

}
