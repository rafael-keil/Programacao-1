import mapa.Mapa;
import org.junit.Assert;
import org.junit.Test;
import personagem.*;

public class HumanoTest {

    @Test
    public void deveRetornarEnvelhecerCorreto() {

        Aragorn aragorn = new Aragorn();
        Boromir boromir = new Boromir();
        Urukhai urukhai = new Urukhai();
        Mapa mapa = new Mapa();
        mapa.inserir(0, aragorn);
        mapa.inserir(1, boromir);
        mapa.inserir(2, urukhai);

        int aragornEsperado = 59;
        int boromirEsperado = 38;
        int urukhaiEsperado = 43;

        aragorn.envelhecer(mapa);
        boromir.envelhecer(mapa);
        urukhai.envelhecer(mapa);

        Assert.assertEquals(aragornEsperado, aragorn.getConstituicao());
        Assert.assertEquals(boromirEsperado, boromir.getConstituicao());
        Assert.assertEquals(urukhaiEsperado, urukhai.getConstituicao());
    }
}
