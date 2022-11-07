import clube.Clube;
import jogador.*;
import org.junit.Assert;
import org.junit.Test;

public class JogadorTest {

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMenosDeTrintaAnos(){

        Clube clube = new Clube( 10,"Grêmio", 100000000.0);
        MeioCampo meioCampo = new MeioCampo("Pedro Henrique", 25, null, 8, 2,100000);
        double valorEsperado = 140000;

        Assert.assertEquals(valorEsperado, meioCampo.valorDeCompra(), 0.01);
        Assert.assertEquals("Sem clube", meioCampo.getClubeAtual());

    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoMeioCampoComMaisDeTrintaAnos(){

        MeioCampo meioCampo = new MeioCampo("Pedro Henrique", 35, null, 8, 2,100000);
        double valorEsperado = 112000;

        Assert.assertEquals(valorEsperado, meioCampo.valorDeCompra(), 0.01);

    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoAtacanteComMaisDeTrintaAnos(){

        Atacante atacante = new Atacante("Pedro Henrique", 35, null, 8, 3,100000, 25);
        double valorEsperado = 168750;

        Assert.assertEquals(valorEsperado, atacante.valorDeCompra(), 0.01);

    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoAtacanteComMenosDeTrintaAnos(){

        Atacante atacante = new Atacante("Pedro Henrique", 20, null, 8, 2,100000, 25);
        double valorEsperado = 175000;

        Assert.assertEquals(valorEsperado, atacante.valorDeCompra(), 0.01);

    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoLateralComMenosDe28Anos(){

        Lateral lateral = new Lateral("Pedro Henrique", 20, null, 8, 2,100000, 25);
        double valorEsperado = 210000;

        Assert.assertEquals(valorEsperado, lateral.valorDeCompra(), 0.01);

    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoLateralComMaisDe28Anos(){

        Lateral lateral = new Lateral("Pedro Henrique", 29, null, 8, 2,100000, 25);
        double valorEsperado = 147000;

        Assert.assertEquals(valorEsperado, lateral.valorDeCompra(), 0.01);

    }

    @Test
    public void deveCalcularCorretamenteOPrecoDoZagueiroComMenosDeTrintaAnos(){

        Zagueiro zagueiro = new Zagueiro("Pedro Henrique", 25, null, 8, 2,100000);
        double valorEsperado = 140000;

        Assert.assertEquals(valorEsperado, zagueiro.valorDeCompra(), 0.01);

    }
}
