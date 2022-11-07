public class App {
    public static void main(String[] args) {

        Categoria1 c1 = new Categoria1("montana", "IVV0478", 10000, 2005);
        Categoria2 c2 = new Categoria2("honda", "IVA0578", 10000, 2015);
        Categoria3 c3 = new Categoria3("caminhao", "IHV0468", 10000, 2000);


        System.out.println(c1.getNome());
        System.out.println(c2.getNome());
        System.out.println(c3.getNome());

        System.out.println(c1.calculaImposto());
        System.out.println(c2.calculaImposto());
        System.out.println(c3.calculaImposto());

        // a base da classe abstrata, é que tu compartilha os métodos e variáveis na hierarquia, mas não pode instanciar nada na classe pai se ela for abstrata, e mesmo assim pode ser feito um Override da classe pai nas filhas
    }
}
