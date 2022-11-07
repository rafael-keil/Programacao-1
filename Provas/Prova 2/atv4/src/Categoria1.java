public class Categoria1 extends IPVA{

    public Categoria1(String nome, String placa, double valor, int ano) {
        super(nome, placa, valor, ano);
    }

    @Override
    public double calculaImposto() {
        return getValor() * 0.03;
    }
}
