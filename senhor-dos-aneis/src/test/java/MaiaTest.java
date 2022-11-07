import classe.Personagem;
import mapa.Mapa;
import org.junit.Assert;
import org.junit.Test;
import personagem.Gandalf;
import personagem.Saruman;

public class MaiaTest {

    @Test
    public void deveRecussitarPersonagensMaia(){

        Gandalf gandalf = new Gandalf();
        Saruman saruman = new Saruman();
        Mapa mapa = new Mapa();
        mapa.inserir(0, gandalf);
        mapa.inserir(9, saruman);

        gandalf.receberDano(100, mapa);
        saruman.receberDano(100, mapa);

        Personagem newGandalf = gandalf.ressuscitar();
        Personagem newSaruman = saruman.ressuscitar();

        Assert.assertNotEquals(newGandalf, gandalf);
        Assert.assertEquals(null, newSaruman);
    }
}
