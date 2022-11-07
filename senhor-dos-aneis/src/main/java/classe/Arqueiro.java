package classe;

import mapa.Mapa;

public class Arqueiro extends Personagem {

    @Override
    public void atacar(Mapa mapa){
        super.atacar(mapa);
        for(int i = 3; i != 0; i--){
            if(mapa.buscarCasa(mapa.buscarPosicao(this)+(getSociedadeAnel() * i)) != null && mapa.buscarCasa(mapa.buscarPosicao(this)+(getSociedadeAnel() * i)).getSociedadeAnel() != this.getSociedadeAnel()){
                mapa.buscarCasa(mapa.buscarPosicao(this)+(getSociedadeAnel() * i)).receberDano(i*agilidade, mapa);
                break;
            }
        }
    }

    @Override
    public void movimentar(Mapa mapa){
        super.movimentar(mapa);
        mapa.movimento(this, getSociedadeAnel());
        mapa.movimento(this, getSociedadeAnel());
    }

}
