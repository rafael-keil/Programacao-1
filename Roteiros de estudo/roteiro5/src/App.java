public class App {
    public static void main(String args[]){

        AssistenteAdministrativo ad1 = new AssistenteAdministrativo("Rafael","rua dos anjos, 13", "M", "15/02/2019", 1500, "admin", "d", i[0] = 1);
        AssistenteAdministrativo ad2 = new AssistenteAdministrativo("Raaaaa","rua dos deee", "F", "15/05/2014", 1650, "admin", "n", [5,2,3,4]);

        AssistenteTecnico at1 = new AssistenteTecnico("George", "casa fofa", "M", "29/11/2020", 1450, "tec", 1.1f);
        AssistenteTecnico at2 = new AssistenteTecnico("Georga", "casa fofaaaaa", "f", "29/10/2010", 1250, "tec", 1.5f);

        ad1.calculaSalario();
        ad2.calculaSalario();
        at1.calculaSalario();
        at2.calculaSalario();

        System.out.println(ad1.toString());
        System.out.println(ad2.toString());
        System.out.println(at1.toString());
        System.out.println(at2.toString());


    }
}
