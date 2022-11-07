package mapa;

import classe.Personagem;
import exeptions.PersonagemJaEstaNoMapaException;
import exeptions.PersonagemNaoEncontradoNoMapaException;
import exeptions.PosicaoOcupadaException;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    HashMap<Integer, Personagem> map = new HashMap<>();

    public Map<Integer, Personagem> getMap() {
        return map;
    }

    public String exibir(){
        StringBuilder atual = new StringBuilder("|");

        for(int i = 0; i < 10; i++){
            if(map.get(i) == null){
                atual.append(" ");
            } else {
                atual.append(map.get(i).toString());
            }
            atual.append("|");
        }

        return atual.toString();
    }

    public void inserir(int posicao, Personagem personagem){

        if(map.get(posicao) != null){
            throw new PosicaoOcupadaException();
        } else if(map.containsValue(personagem)){
            throw new PersonagemJaEstaNoMapaException();
        } else {
            map.put(posicao, personagem);
        }
    }

    public int buscarPosicao(Personagem personagem) {

        for(int i = 0; i < 10; i++){
            if(map.get(i) != null && map.get(i).equals(personagem)){
                return i;
            }
        }
        throw new PersonagemNaoEncontradoNoMapaException();
    }

    public Personagem buscarCasa(int posicao){
        return map.get(posicao);
    }

    public boolean movimento(Personagem personagem, int direcao){

        int posicao = this.buscarPosicao(personagem);

        if(this.buscarCasa(posicao+direcao) == null){
            this.getMap().remove(posicao);
            this.getMap().put(posicao+direcao, personagem);
            return true;
        }

        return false;
    }

}
