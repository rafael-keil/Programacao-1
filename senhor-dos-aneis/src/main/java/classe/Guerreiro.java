package classe;

import mapa.Mapa;

public class Guerreiro extends Personagem{

    boolean jaMovimentou = false;


    @Override
    public void atacar(Mapa mapa){
        if(mapa.movimento(this, getSociedadeAnel())){
            jaMovimentou = true;
        } else if (mapa.buscarCasa(mapa.buscarPosicao(this)+getSociedadeAnel()).getSociedadeAnel() != this.getSociedadeAnel()){
            mapa.buscarCasa(mapa.buscarPosicao(this)+getSociedadeAnel()).receberDano(this.forca * 2, mapa);
        }
    }

    @Override
    public void movimentar(Mapa mapa){
        if(jaMovimentou){
            jaMovimentou = false;
        } else {
            mapa.movimento(this, getSociedadeAnel());
        }
    }
}
