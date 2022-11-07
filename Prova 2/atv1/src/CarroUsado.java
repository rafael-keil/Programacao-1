public class CarroUsado extends Carros{

    public CarroUsado(int ano, String modelo, double preco) {
        super(ano, modelo, preco);
    }

    @Override
    public double CalculaPreco() {
        return super.CalculaPreco() * 0.7;
    }
}
