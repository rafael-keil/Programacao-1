import nave.Nave;
import org.junit.Assert;
import org.junit.Test;
import planeta.Planeta;
import recurso.Recurso;

import java.util.ArrayList;


public class NaveTest {


    @Test
    public void deveFicarADerivaQuandoFaltarCombustivelParaIrAteUmPlaneta() {
        int posicaoEsperada = 3;
        Nave milleniumFalcon = new Nave(9);
        Planeta tatooine = new Planeta(4, new ArrayList<>());

        milleniumFalcon.explorar(tatooine);
        int posicaoResultante = milleniumFalcon.getPosicao();

        Assert.assertEquals(posicaoEsperada, posicaoResultante);
    }

    @Test
    public void deveIrEVoltar() {
        int posicaoEsperada = 0;
        Nave milleniumFalcon = new Nave(50);
        Planeta tatooine = new Planeta(4, new ArrayList<>());

        milleniumFalcon.explorar(tatooine);
        int posicaoResultante = milleniumFalcon.getPosicao();

        Assert.assertEquals(posicaoEsperada, posicaoResultante);
    }

    @Test
    public void devePararNaVolta() {
        int posicaoEsperada = 2;
        Nave milleniumFalcon = new Nave(18);
        Planeta tatooine = new Planeta(4, new ArrayList<>());

        milleniumFalcon.explorar(tatooine);
        int posicaoResultante = milleniumFalcon.getPosicao();

        Assert.assertEquals(posicaoEsperada, posicaoResultante);
    }


    @Test
    public void deveFazerCaminhoPorPrioridadeDeValorTotal() {
        ArrayList<Recurso> r1 = new ArrayList<Recurso>();
        r1.add(new Recurso(400,400));
        r1.add(new Recurso(400,400));
        r1.add(new Recurso(400,400));
        ArrayList<Recurso> r2 = new ArrayList<Recurso>();
        r2.add(new Recurso(4000,20));
        r2.add(new Recurso(4000,20));
        r2.add(new Recurso(4000,20));
        ArrayList<Recurso> r3 = new ArrayList<Recurso>();
        r3.add(new Recurso(40000,20));
        r3.add(new Recurso(40000,20));
        r3.add(new Recurso(40000,20));
        ArrayList<Recurso> r4 = new ArrayList<Recurso>();
        r4.add(new Recurso(40,1));
        r4.add(new Recurso(40,1));
        r4.add(new Recurso(40,1));


        Planeta p1 = new Planeta(4, r1);
        Planeta p2 = new Planeta(8, r2);
        Planeta p3 = new Planeta(12, r3);
        Planeta p4 = new Planeta(20, r4);

        ArrayList<Planeta> planetas = new ArrayList<Planeta>();
        planetas.add(p1);
        planetas.add(p2);
        planetas.add(p3);
        planetas.add(p4);

        Nave milleniumFalcon = new Nave(500);
        milleniumFalcon.explorar(planetas, "valor total");

        Assert.assertEquals(332, milleniumFalcon.getQuantidadeDeCombustivel());
    }

    @Test
    public void deveFazerCaminhoPorPrioridadeDeValorPorPeso() {
        ArrayList<Recurso> r1 = new ArrayList<Recurso>();
        r1.add(new Recurso(400,400));
        ArrayList<Recurso> r2 = new ArrayList<Recurso>();
        r2.add(new Recurso(4000,20));
        ArrayList<Recurso> r3 = new ArrayList<Recurso>();
        r3.add(new Recurso(40000,20));
        ArrayList<Recurso> r4 = new ArrayList<Recurso>();
        r4.add(new Recurso(40,1));


        Planeta p1 = new Planeta(4, r1);
        Planeta p2 = new Planeta(8, r2);
        Planeta p3 = new Planeta(12, r3);
        Planeta p4 = new Planeta(20, r4);

        ArrayList<Planeta> planetas = new ArrayList<Planeta>();
        planetas.add(p1);
        planetas.add(p2);
        planetas.add(p3);
        planetas.add(p4);

        Nave milleniumFalcon = new Nave(500);
        milleniumFalcon.explorar(planetas, "valor por peso");

        Assert.assertEquals(356, milleniumFalcon.getQuantidadeDeCombustivel());
    }

    @Test
    public void deveFazerCaminhoPorPrioridadeDeMaisPerto() {
        ArrayList<Recurso> r1 = new ArrayList<Recurso>();
        r1.add(new Recurso(400,400));
        ArrayList<Recurso> r2 = new ArrayList<Recurso>();
        r2.add(new Recurso(4000,20));
        ArrayList<Recurso> r3 = new ArrayList<Recurso>();
        r3.add(new Recurso(40000,20));
        ArrayList<Recurso> r4 = new ArrayList<Recurso>();
        r4.add(new Recurso(40,1));


        Planeta p1 = new Planeta(4, r1);
        Planeta p2 = new Planeta(8, r2);
        Planeta p3 = new Planeta(12, r3);
        Planeta p4 = new Planeta(20, r4);

        ArrayList<Planeta> planetas = new ArrayList<Planeta>();
        planetas.add(p1);
        planetas.add(p2);
        planetas.add(p3);
        planetas.add(p4);

        Nave milleniumFalcon = new Nave(500);
        milleniumFalcon.explorar(planetas, "Qualquer coisa, sempre vai ser por ordem do menor ao maior");

        Assert.assertEquals(380, milleniumFalcon.getQuantidadeDeCombustivel());
    }

    @Test
    public void deveFicarADerivaNaIda() {
        ArrayList<Recurso> r1 = new ArrayList<Recurso>();
        r1.add(new Recurso(400,400));
        ArrayList<Recurso> r2 = new ArrayList<Recurso>();
        r2.add(new Recurso(4000,20));
        ArrayList<Recurso> r3 = new ArrayList<Recurso>();
        r3.add(new Recurso(40000,20));
        ArrayList<Recurso> r4 = new ArrayList<Recurso>();
        r4.add(new Recurso(40,1));


        Planeta p1 = new Planeta(4, r1);
        Planeta p2 = new Planeta(8, r2);
        Planeta p3 = new Planeta(12, r3);
        Planeta p4 = new Planeta(20, r4);

        ArrayList<Planeta> planetas = new ArrayList<Planeta>();
        planetas.add(p1);
        planetas.add(p2);
        planetas.add(p3);
        planetas.add(p4);

        Nave milleniumFalcon = new Nave(54);
        milleniumFalcon.explorar(planetas, "Qualquer coisa, sempre vai ser por ordem do menor ao maior");

        Assert.assertEquals(18, milleniumFalcon.getPosicao());
    }

    @Test
    public void deveFicarADerivaNavolta() {
        ArrayList<Recurso> r1 = new ArrayList<Recurso>();
        r1.add(new Recurso(400,400));
        ArrayList<Recurso> r2 = new ArrayList<Recurso>();
        r2.add(new Recurso(4000,20));
        ArrayList<Recurso> r3 = new ArrayList<Recurso>();
        r3.add(new Recurso(40000,20));
        ArrayList<Recurso> r4 = new ArrayList<Recurso>();
        r4.add(new Recurso(40,1));


        Planeta p1 = new Planeta(4, r1);
        Planeta p2 = new Planeta(8, r2);
        Planeta p3 = new Planeta(12, r3);
        Planeta p4 = new Planeta(20, r4);

        ArrayList<Planeta> planetas = new ArrayList<Planeta>();
        planetas.add(p1);
        planetas.add(p2);
        planetas.add(p3);
        planetas.add(p4);

        Nave milleniumFalcon = new Nave(90);
        milleniumFalcon.explorar(planetas, "Qualquer coisa, sempre vai ser por ordem do menor ao maior");

        Assert.assertEquals(10, milleniumFalcon.getPosicao());
    }


}
