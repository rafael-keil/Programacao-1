public class Ninja {

    private String nome;
    private int chackra = 100;
    private Jutsu jutsuPricipal;


    public Ninja(String nome, Jutsu jutsuPricipal) {
        this.nome = nome;
        this.jutsuPricipal = jutsuPricipal;
    }

    public void atacar(Ninja ninjaOponente){
        ninjaOponente.receberGolpe(this.jutsuPricipal.getDano());
        this.receberGolpe(this.jutsuPricipal.getConsumo());
    }

    public void receberGolpe(int danoGolpe){
        this.chackra -= danoGolpe;
    }

    public String getNome() {
        return nome;
    }

    public int getChackra() {
        return chackra;
    }
}
