import org.junit.Assert;
import org.junit.Test;
import personagem.Legolas;


public class ElfoTest {
    @Test
    public void deveRecussitarPersonagensMaia(){

        Legolas legolas = new Legolas();
        String falaElfica = "I amar prestar aen, han mathon ne nem, han mathon ne chae, a han noston ned.";


        Assert.assertEquals(falaElfica, legolas.falarElfico());
    }
}
