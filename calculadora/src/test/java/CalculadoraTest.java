import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros(){
        Calculadora c1 = new Calculadora();
        c1.a = 10;
        c1.b = 5;
        double esperado = 15;

        Assert.assertEquals(esperado, c1.soma(), 0);
    }

    @Test
    public void deveSubtrairCorretamenteQuandoOsValoresForemInteiros(){
        Calculadora c1 = new Calculadora();
        c1.a = 102;
        c1.b = 15;
        double esperado = 87;

        Assert.assertEquals(esperado, c1.subtracao(), 0);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros(){
        Calculadora c1 = new Calculadora();
        c1.a = 10;
        c1.b = 2;
        double esperado = 5;

        Assert.assertEquals(esperado, c1.divisao(), 0);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros(){
        Calculadora c1 = new Calculadora();
        c1.a = 15;
        c1.b = 5;
        double esperado = 75;

        Assert.assertEquals(esperado, c1.multiplicacao(), 0);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes(){
        Calculadora c1 = new Calculadora();
        c1.a = 15.2;
        c1.b = 2;
        double esperado = 7.6;

        Assert.assertEquals(esperado, c1.divisao(), 0);
    }

    @Test
    public void deveFazerCorretamenteRaizQuadrada(){
        Calculadora c1 = new Calculadora();
        c1.a = 9;
        double esperado = 3;

        Assert.assertEquals(esperado, c1.raizQuadrada(), 0.01);
    }

    @Test
    public void deveFazerCorretamenteExponenciacao(){
        Calculadora c1 = new Calculadora();
        c1.a = 9;
        c1.b = 4;
        double esperado = 6561;

        Assert.assertEquals(esperado, c1.exponenciacao(), 0);
    }

    @Test
    public void deveRealizarBhaskaraEntreOsNumeros(){
        Calculadora c1 = new Calculadora();
        c1.a = 1;
        c1.b = 2;
        c1.c = -15;
        double esperadoX1 = 3;
        double esperadoX2 = -5;

        Assert.assertEquals(esperadoX1, c1.bhaskaraX1(), 0.01);
        Assert.assertEquals(esperadoX2, c1.bhaskaraX2(), 0.01);
    }


}
