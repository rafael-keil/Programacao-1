public class App {

    public static void main(String[] args){

        Quarto q1 = new Quarto(1,true,0);
        Single s1 = new Single(q1, "Roberto");
        s1.setVago(false);
        s1.setEstadia(30);


        Casal c1 = new Casal(2,false,20,"Rafael","Larissa");

        System.out.println(s1);
        System.out.println(c1);

        System.out.println(s1.comparaEstadia(c1));

    }


}
