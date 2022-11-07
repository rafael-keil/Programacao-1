public class Celular extends Hardware{

    public Celular(String tipo, int serial, double valor) {
        super(tipo, serial, valor);
    }

    public double valorVenda(){
        return valor * 1.5;
    }
}
