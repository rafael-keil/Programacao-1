public class Categoria2 extends IPVA{

    public Categoria2(String nome, String placa, double valor, int ano) {
        super(nome, placa, valor, ano);
    }

    @Override
    public double calculaImposto() {
        return getValor() * 0.02;
    }
}
