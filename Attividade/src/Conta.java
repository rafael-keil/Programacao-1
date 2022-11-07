public class Conta {

    private int numero;

    private double saldo;

    private Correntista corr;


    public Conta(){

    }

    public void setNumero(int numero) {

        this.numero = numero;
    }

    public int getNumero() {

        return numero;
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setCorr(Correntista corr) {

        this.corr = corr;
    }

    public Correntista getCorr() {

        return corr;
    }

    public void retirar(double valor){

        if(saldo>=valor){

            saldo = saldo - valor;

        }else System.out.printf("Valor indisponível!\n");
    }

    public void depositar(double valor){

        saldo = saldo + valor;
    }

    public void transferir(double valor, Conta destino){

        if(saldo>=valor){

            saldo = saldo - valor;

            destino.depositar(valor);

        }else System.out.printf("Valor indisponível!\n");
    }

    public void extrato(){

        System.out.println("Número da conta:   " + numero + "   Nome: " + corr.getNome() + "   Idade: " + corr.getIdade());

        System.out.println("Saldo: " + saldo);

    }

}