import org.junit.Assert;
import org.junit.Test;
import planeta.Planeta;
import recurso.Recurso;

import java.util.ArrayList;

public class PlanetaTest {

    @Test
    public void deveTerValorTotalZeradoQuandoNaoExistirNenhumRecurso() {

        Planeta p1 = new Planeta(4, new ArrayList<>());

        Assert.assertEquals(0, p1.valorTotal());

    }

    @Test
    public void deveTerValorTotalQuandoExistirRecursosNoPlaneta() {

        ArrayList<Recurso> r1 = new ArrayList<Recurso>();
        r1.add(new Recurso(40000,20));
        r1.add(new Recurso(400,20));
        r1.add(new Recurso(40,20));

        Planeta p1 = new Planeta(4, r1);

        Assert.assertEquals(40440, p1.valorTotal());

    }

    @Test
    public void deveTerValorPorPesoZeradoQuandoNaoExistirNenhumRecurso() {

        Planeta p1 = new Planeta(4, new ArrayList<>());

        Assert.assertEquals(0, p1.valorPeso());

    }

    @Test
    public void deveTerValorPorPesoQuandoExistirRecursosNoPlaneta() {

        ArrayList<Recurso> r1 = new ArrayList<Recurso>();
        r1.add(new Recurso(40000,20));
        r1.add(new Recurso(400,20));
        r1.add(new Recurso(40,20));

        Planeta p1 = new Planeta(4, r1);

        Assert.assertEquals(2022, p1.valorPeso());

    }


}
