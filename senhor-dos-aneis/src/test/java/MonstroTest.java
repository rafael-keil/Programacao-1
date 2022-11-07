import org.junit.Assert;
import org.junit.Test;
import personagem.*;

public class MonstroTest {

    @Test
    public void deveRetornarGrunidoDosMonstros(){

        Goblim goblin = new Goblim();
        Orc orc = new Orc();
        Urukhai urukhai = new Urukhai();

        String goblinEsperado = "Iiisshhhh";
        String orcEsperado = "Arrrggghhh";
        String urukhaiEsperado = "Uuurrrrrr";

        Assert.assertEquals(goblinEsperado, goblin.grunir());
        Assert.assertEquals(orcEsperado, orc.grunir());
        Assert.assertEquals(urukhaiEsperado, urukhai.grunir());

    }
}
