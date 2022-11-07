public class App {
    public static void main (String []args){

        Fabricante f1 = new Fabricante("Apple", "www.apple.com", "China");

        Hardware h1 = new Hardware("disco rigido", 21548, 150);
        h1.setF(f1);

        Computador comp1 = new Computador("notebook", 21596, 150);

        comp1.setTipo("notebook", "linux");

        Celular cel1 = new Celular("i3", 29514, 150);

        System.out.println(h1);

        System.out.println(cel1.valorVenda());
        System.out.println(comp1.valorVenda());
        System.out.println(h1.valorVenda());

        System.out.println(comp1.getTipo());

    }
}
