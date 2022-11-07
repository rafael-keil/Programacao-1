import java.util.Objects;

public class Quarto {

    private int numero;
    private boolean vago;
    private int estadia;

    public Quarto() {

    }

    public Quarto(int numero, boolean vago, int estadia) {
        this.numero = numero;
        this.vago = vago;
        this.estadia = estadia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setVago(boolean vago) {
        this.vago = vago;
    }

    public void setEstadia(int estadia) {
        this.estadia = estadia;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isVago() {
        return vago;
    }

    public int getEstadia() {
        return estadia;
    }

    public String comparaEstadia(Quarto o) {
        if (this.estadia == o.estadia){
            return "Os quartos terão a mesma estadia.";
        }
        else if (this.estadia > o.estadia){
            return "O primeiro quarto ficará ocupado mais tempo";
        }
        else {
            return "O segundo quarto ficará ocupado mais tempo.";
        }
    }


    @Override
    public String toString() {
        return "Quarto{" +
                "numero=" + numero +
                ", vago=" + vago +
                ", estadia=" + estadia +
                '}';
    }

}
