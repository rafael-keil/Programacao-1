public class Categoria3 extends IPVA{

    public Categoria3(String nome, String placa, double valor, int ano) {
        super(nome, placa, valor, ano);
    }

    @Override
    public double calculaImposto() {
        return getValor() * 0.01;
    }
}
