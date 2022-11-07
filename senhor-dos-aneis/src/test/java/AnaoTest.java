import org.junit.Assert;
import org.junit.Test;
import personagem.Gimli;

public class AnaoTest {

    @Test
    public void deveReproduzirFalaCorreta(){

        Gimli gimli = new Gimli();
        String falaEsperada = "Let them come. There is one Dwarf yet in Moria who still draws breath.";

        Assert.assertEquals(falaEsperada, gimli.falar());

        gimli.beber();
        gimli.beber();
        gimli.beber();
        falaEsperada = "What did I say? He can't hold his liquor!";

        Assert.assertEquals(falaEsperada, gimli.falar());


    }
}
