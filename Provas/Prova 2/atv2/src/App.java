public class App {
    public static void main(String[] args) {

        Carro carro1 = new Carro(2002, "corola", "preto");

        Casa casa1 = new Casa(1500, 3000000, "bege");

        carro1.setCor("rosa");
        casa1.setCor("vermelho");

        System.out.println(carro1.getCor());
        System.out.println(casa1.getCor());

        // Implementar a interface nos métodos, exige que os mesmos tenham o que foi descrito na interface
    }
}
