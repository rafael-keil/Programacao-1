public class Jutsu {

    private int consumo;
    private int dano;

    public Jutsu(int consumo, int dano) {
        if( consumo <= 5 ){
            this.consumo = consumo;
        } else {
            this.consumo = 5;
        }

        if( dano <= 10) {
            this.dano = dano;
        } else {
            this.dano = 10;

        }

    }

    public int getConsumo() {
        return consumo;
    }

    public int getDano() {
        return dano;
    }
}
