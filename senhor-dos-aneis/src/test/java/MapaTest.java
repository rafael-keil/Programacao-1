import exeptions.*;

import mapa.Mapa;
import org.junit.Test;
import personagem.*;


public class MapaTest {

    @Test(expected = PersonagemJaEstaNoMapaException.class)
    public void deveEntrarPersonagemJaEstaNoMapaException(){

        Legolas legolas = new Legolas();
        Mapa mapa = new Mapa();

        mapa.inserir(0, legolas);
        mapa.inserir(8, legolas);

    }

    @Test(expected = PersonagemNaoEncontradoNoMapaException.class)
    public void deveEntrarPersonagemNaoEncontradoNoMapaException(){
        Legolas legolas = new Legolas();
        Mapa mapa = new Mapa();

        mapa.buscarPosicao(legolas);
    }

    @Test(expected = PosicaoOcupadaException.class)
    public void deveEntrarPosicaoOcupadaException(){
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Mapa mapa = new Mapa();

        mapa.inserir(0, legolas);
        mapa.inserir(0, orc);
    }
}
