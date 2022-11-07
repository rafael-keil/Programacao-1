public class Carros {

    int ano;
    String modelo;
    double preco;

    public Carros(int ano, String modelo, double preco) {
        this.ano = ano;
        this.modelo = modelo;
        this.preco = preco;
    }

    public Carros() {
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double CalculaPreco(){
        return this.preco;
    }
}
