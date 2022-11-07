import dicionario.Dicionario;
import dicionario.PalavraNaoEncontradaException;
import dicionario.TipoDicionario;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DicionarioTest {

    @Test
    public void deveTraduzirCarroELivroDoInglesParaPortuguesEDoPortuguesParaOIngles() {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Carro", "Car", TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Livro", "Book", TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Tiger", "Tigre", TipoDicionario.PORTUGUES);
        dicionario.adicionarPalavra("Paper", "Papel", TipoDicionario.PORTUGUES);

        assertEquals("Car", dicionario.traduzir("carro", TipoDicionario.INGLES));
        assertEquals("Book", dicionario.traduzir("lIVRO", TipoDicionario.INGLES));

        assertEquals("Papel", dicionario.traduzir("pApEr", TipoDicionario.PORTUGUES));
        assertEquals("Tigre", dicionario.traduzir("TIGER", TipoDicionario.PORTUGUES));
    }

    @Test(expected = PalavraNaoEncontradaException.class)
    public void deveLancarExceptionQuandoUmaPalavraNaoForEncontrada() {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Carro", "Car", TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Livro", "Book", TipoDicionario.INGLES);

        dicionario.traduzir("Caneta", TipoDicionario.INGLES);
    }

    @Test(expected = PalavraNaoEncontradaException.class)
    public void deveLancarExceptionQuandoUmaPalavraNaoForEncontrada2() {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Carro", "Car", TipoDicionario.INGLES);
        dicionario.adicionarPalavra("Livro", "Book", TipoDicionario.INGLES);

        dicionario.traduzir("Pen", TipoDicionario.PORTUGUES);
    }

}
