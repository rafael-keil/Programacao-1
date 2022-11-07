package nave;

import planeta.Planeta;
import recurso.Recurso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nave {

    int combustivel;
    int posicao;
    ArrayList<Recurso> recursos = new ArrayList<>();

    public Nave(int combustivel) {
        this.combustivel = combustivel;
        this.posicao = 0;
    }

    public int getQuantidadeDeCombustivel() {
        return combustivel;
    }

    public int getPosicao() {
        return posicao;
    }

    public void coleta(Planeta planeta){
        for(int i = 0; i < planeta.getRecursos().size(); i++){
            recursos.add(planeta.getRecursos().get(i));
        }
    }

    public boolean movimento(Planeta planeta, int direcao){
        for(; posicao != planeta.getPosicao(); posicao += direcao){
            if(this.combustivel > 2){
                this.combustivel -= 3;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean volta(){
        for(; posicao > 0; posicao--){
            if(this.combustivel > 2){
                this.combustivel -= 3;
            } else {
                return false;
            }
        }
        return true;
    }

    public List<Recurso> explorar(Planeta planeta){

        if(!movimento(planeta, 1)){
            return recursos;
        }

        coleta(planeta);

        if(!volta()){
            return recursos;
        }

        return recursos;
    }


    public List<Recurso> explorar(List<Planeta> planetas, String prioridade){


        Planeta ultimo = new Planeta(0, new ArrayList<>());
        int direcao;

        if(prioridade.equals("valor total")){
            Collections.sort(planetas, Planeta.planetaTotalComparator);
        } else if(prioridade.equals("valor por peso")){
            Collections.sort(planetas, Planeta.planetaPesoComparator);
        } else {
            Collections.sort(planetas, Planeta.planetaPosicaoComparator);
        }

        for(Planeta planeta : planetas){

            if(planeta.getPosicao() > ultimo.getPosicao() ){
                direcao = 1;
            } else {
                direcao = -1;
            }

            if(!movimento(planeta, direcao)){
                return recursos;
            }

            ultimo = planeta;
            coleta(planeta);
        }

        if(!volta()){
            return recursos;
        }
        return recursos;
    }
}
