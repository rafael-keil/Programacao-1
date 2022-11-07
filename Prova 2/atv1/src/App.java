public class App {
    public static void main(String[] args) {

        Carros c1 = new Carros(2001, "corsa", 15000);

        Carros c2 = new Carros();
        c2.setAno(2001);
        c2.setModelo("Corsa");
        c2.setPreco(15000);

        // Aqui vemos um explo de sobrecarga, onde temos dois métodos com o mesmo nome, mas com uma chamado diferente, fazendo ele reconhecer qual pela chamada do método


       CarroUsado cu1 = new CarroUsado(2000, "astra", 15000);

        System.out.println(c1.CalculaPreco());
        System.out.println(cu1.CalculaPreco());

        // Aqui vemos um exemplo de sobreposição, onde o método tem a mesma chamada em ambas as vezes, mas na classe pai e na filha muda como executa

    }
}
