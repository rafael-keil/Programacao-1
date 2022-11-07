public class Computador extends Hardware{

    public Computador() {

    }

    public Computador(String tipo, int serial, double valor) {
        super(tipo, serial, valor);
    }

    public double valorVenda(){
        return valor * 1.2;
    }

    public void setTipo(String tipo, String sisop){
        this.tipo = tipo + " - " + sisop;
    }


}
