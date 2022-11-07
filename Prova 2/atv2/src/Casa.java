public class Casa implements Colorido{

    double tamanho;
    double valor;
    String cor;

    public Casa(double tamanho, double valor, String cor) {
        this.tamanho = tamanho;
        this.valor = valor;
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String getCor() {
        return null;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }
}
