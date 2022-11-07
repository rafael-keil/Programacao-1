public class Hardware{

   String tipo;
   int serial;
   double valor;
   Fabricante f;

    public Hardware() {

    }

    public Hardware(String tipo, int serial, double valor) {
        this.tipo = tipo;
        this.serial = serial;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fabricante getF() {
        return f;
    }

    public void setF(Fabricante f) {
        this.f = f;
    }

    public double valorVenda(){
        return valor;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "tipo='" + tipo + '\'' +
                ", serial=" + serial +
                ", valor=" + valor +
                ", f=" + f +
                '}';
    }
}
