package dicionario;

import java.util.Map;
import java.util.TreeMap;

public class Dicionario {

    Map<String,String> ingles = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    Map<String,String> portugues = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    public void adicionarPalavra(String palavra, String traducao, TipoDicionario dicionario){
        if(dicionario == TipoDicionario.INGLES) {
            ingles.put(palavra, traducao);
        } else {
            portugues.put(palavra, traducao);
        }
    }

    public String traduzir(String palavra, TipoDicionario dicionarioDeBusca){
        if(dicionarioDeBusca == TipoDicionario.INGLES){
            if(ingles.get(palavra) == null){
                throw new PalavraNaoEncontradaException();
            } else {
                return ingles.get(palavra);
            }
        } else {
            if(portugues.get(palavra) == null){
                throw new PalavraNaoEncontradaException();
            } else {
                return portugues.get(palavra);
            }
        }
    }
}
