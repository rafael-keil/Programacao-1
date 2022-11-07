package classe;

import mapa.Mapa;

public class Mago extends Personagem{

    @Override
    public void atacar(Mapa mapa) {
        for(int i = 1; i < 11; i++){
            if(mapa.buscarCasa(i) != null && mapa.buscarCasa(i).getSociedadeAnel() != this.getSociedadeAnel()){
                mapa.buscarCasa(i).receberDano(this.getInteligencia(), mapa);
            }
        }
    }

    @Override
    public void movimentar(Mapa mapa) {

        boolean podeMovimentar = true;

        for(Personagem personagem : mapa.getMap().values()){
            if(personagem.getSociedadeAnel() != this.getSociedadeAnel()) {
                podeMovimentar = false;
            }
        }

        if(podeMovimentar){
            mapa.movimento(this, getSociedadeAnel());
        }

    }

}
