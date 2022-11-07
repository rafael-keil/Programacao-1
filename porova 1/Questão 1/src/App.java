public class App {
    public static void main(String[] args) {

        Conta c1 = new Conta("Rafael", "rafa@gmail.com");
        Filme f1 = new Filme("Bastardos inglorios", 1999);
        c1.setF(f1);

        System.out.println(c1.getF().getNome());
        System.out.println(c1.getF().getAno());
        System.out.println(c1);

    }
}
