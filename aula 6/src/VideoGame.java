public class VideoGame extends Hardware{

    public VideoGame(String tipo, int serial, double valor) {
        super(tipo, serial, valor);
    }

    public double valorVenda(){
        return valor * 5;
    }

}
