package mapa;

import classe.Personagem;
import exeptions.SauronDominaOMundoException;

public class Simulador {

    boolean sauron = true;

    public void simular(Mapa mapa){

        for(int i = 1; i < 100000000; i++){

            turno(mapa, i);

            if(mapa.buscarCasa(9) != null && mapa.getMap().get(9).getSociedadeAnel() == 1){
                i = 100000000;
            }

            if(sauron){
                throw new SauronDominaOMundoException();
            } else {
                sauron = true;
            }
        }
    }

    private void turno(Mapa mapa, int turno){
        for(int j = 0; j < 10; j++){
            if(mapa.buscarCasa(j) != null && mapa.buscarCasa(j).getTurno() < turno){
                Personagem personagemVez = mapa.buscarCasa(j);
                personagemVez.atacar(mapa);
                personagemVez.movimentar(mapa);
                personagemVez.setTurno(turno);
            }
            if(mapa.buscarCasa(j) != null && mapa.buscarCasa(j).getSociedadeAnel() == 1){
                sauron = false;
            }
        }
    }
}
