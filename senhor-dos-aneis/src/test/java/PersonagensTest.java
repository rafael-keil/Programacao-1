import org.junit.Assert;
import org.junit.Test;
import personagem.*;

public class PersonagensTest {

    @Test
    public void deveRetornarToStringDeTodosOsPersonagens(){

        Aragorn aragorn = new Aragorn();
        Boromir boromir = new Boromir();
        Gandalf gandalf = new Gandalf();
        Gimli gimli = new Gimli();
        Goblim goblin = new Goblim();
        Legolas legolas = new Legolas();
        Orc orc = new Orc();
        Saruman saruman = new Saruman();
        Urukhai urukhai = new Urukhai();

        String aragornEsperado = "A";
        String boromirEsperado = "B";
        String gandalfEsperado = "G";
        String gimliEsperado = "I";
        String goblinEsperado = "M";
        String legolasEsperado = "L";
        String orcEsperado = "O";
        String sarumanEsperado = "S";
        String urukhaiEsperado = "U";

        Assert.assertEquals(aragornEsperado, aragorn.toString());
        Assert.assertEquals(boromirEsperado, boromir.toString());
        Assert.assertEquals(gandalfEsperado, gandalf.toString());
        Assert.assertEquals(gimliEsperado, gimli.toString());
        Assert.assertEquals(goblinEsperado, goblin.toString());
        Assert.assertEquals(legolasEsperado, legolas.toString());
        Assert.assertEquals(orcEsperado, orc.toString());
        Assert.assertEquals(sarumanEsperado, saruman.toString());
        Assert.assertEquals(urukhaiEsperado, urukhai.toString());

    }

    @Test
    public void deveRetornarFalaDeTodosOsPersonagens(){

        Aragorn aragorn = new Aragorn();
        Boromir boromir = new Boromir();
        Gandalf gandalf = new Gandalf();
        Gimli gimli = new Gimli();
        Legolas legolas = new Legolas();
        Saruman saruman = new Saruman();
        Urukhai urukhai = new Urukhai();

        String aragornEsperado = "A day may come when the courage of men fails… but it is not THIS day.";
        String boromirEsperado = "One does not simply walk into Mordor.";
        String gandalfEsperado = "A Wizard is never late, nor is he early. He arrives precisely when he means to.";
        String gimliEsperado = "Let them come. There is one Dwarf yet in Moria who still draws breath.";
        String legolasEsperado = "They're taking the Hobbits to Isengard!";
        String sarumanEsperado = "Against the power of Mordor there can be no victory.";
        String urukhaiEsperado = "Looks like meat's back on the menu boys!";

        Assert.assertEquals(aragornEsperado, aragorn.falar());
        Assert.assertEquals(boromirEsperado, boromir.falar());
        Assert.assertEquals(gandalfEsperado, gandalf.falar());
        Assert.assertEquals(gimliEsperado, gimli.falar());
        Assert.assertEquals(legolasEsperado, legolas.falar());
        Assert.assertEquals(sarumanEsperado, saruman.falar());
        Assert.assertEquals(urukhaiEsperado, urukhai.falar());

    }
}
