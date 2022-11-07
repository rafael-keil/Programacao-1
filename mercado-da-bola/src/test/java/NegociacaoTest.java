import clube.Clube;
import jogador.*;
import negociacao.Negociacao;
import org.junit.Assert;
import org.junit.Test;

public class NegociacaoTest {

    @Test
    public void deveSerPossivelNegociarUmGoleiroComUmClubeQueTemSaldoEmCaixa() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube( 10,"Grêmio", 100000000.0);
        Goleiro goleiro = new Goleiro("Marcelo Grohe", 33, null, 8, 1,800500, 12);

        boolean foiPossivelNegociar = negociacao.negociar(clube, goleiro);

        Assert.assertTrue(foiPossivelNegociar);
        Assert.assertEquals("Grêmio", goleiro.getClubeAtual());
    }

    @Test
    public void naoDeveSerPossivelNegociarUmAtacanteComUmClubeQueTemReputacaoHistoricaMenorQueASua() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube(3,"Internacional", 100000000.0);
        Atacante atacante = new Atacante("Cristiano Ronaldo", 35, null, 10, 2, 800500, 20);

        boolean foiPossivelNegociar = negociacao.negociar(clube, atacante);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarPorFaltaDeCaixaDisponivel() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube( 10,"Grêmio", 10.0);
        Zagueiro zagueiro = new Zagueiro("Jonas Brother", 33, null, 8, 1,800500);

        boolean foiPossivelNegociar = negociacao.negociar(clube, zagueiro);

        Assert.assertFalse(foiPossivelNegociar);
    }

    @Test
    public void naoDeveSerPossivelNegociarPorFaltaDeInteresse() {

        Negociacao negociacao = new Negociacao();
        Clube clube = new Clube( 10,"Grêmio", 10.0);
        MeioCampo meioCampo = new MeioCampo("Jonas Brother", 33, null, 8, 1,800500);

        boolean foiPossivelNegociar = negociacao.negociar(clube, meioCampo);

        Assert.assertFalse(foiPossivelNegociar);
    }
}
