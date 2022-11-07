package planeta;

import recurso.Recurso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Planeta {

    private final int posicao;
    private final ArrayList<Recurso> recursos;

    public Planeta(int posicao, List<Recurso> recursos) {
        this.posicao = posicao;
        this.recursos = (ArrayList<Recurso>) recursos;
    }

    public int getPosicao() {
        return posicao;
    }

    public List<Recurso> getRecursos() {
        return recursos;
    }

    public int valorTotal(){
        int quant = 0;

        for(Recurso recurso : recursos){
            quant += recurso.getValor();
        }

        return quant;
    }

    public int valorPeso(){
        int quant = 0;

        for(Recurso recurso : recursos){
            quant += (recurso.getValor() / recurso.getPeso());
        }

        return quant;
    }

    public static final Comparator<Planeta> planetaTotalComparator = new Comparator<Planeta>() {
        public int compare(Planeta s1, Planeta s2) {
            int planetaTotal1 = s1.valorTotal();
            int planetaTotal2 = s2.valorTotal();

            return planetaTotal1-planetaTotal2;
        }
    };

    public static final Comparator<Planeta> planetaPesoComparator = new Comparator<Planeta>() {
        public int compare(Planeta s1, Planeta s2) {
            int planetaTotal1 = s1.valorPeso();
            int planetaTotal2 = s2.valorPeso();

            return planetaTotal1-planetaTotal2;
        }
    };

    public static final Comparator<Planeta> planetaPosicaoComparator = new Comparator<Planeta>() {
        public int compare(Planeta s1, Planeta s2) {
            int planetaTotal1 = s1.getPosicao();
            int planetaTotal2 = s2.getPosicao();

            return planetaTotal1-planetaTotal2;
        }
    };


}
