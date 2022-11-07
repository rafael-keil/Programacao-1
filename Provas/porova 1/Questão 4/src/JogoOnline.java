public class JogoOnline {

    public static void main (String args[]){

        Jogo j1 = new Jogo("Cods", "PC", 2022);
        System.out.println(j1);

        Jogo j2 = new Jogo("GTA", "XBOX", 2010);
        System.out.println(j2);

        j1.setAno(2030);
        System.out.println(j1);

        j1.setAno(2015);
        System.out.println(j1);
    }

}
