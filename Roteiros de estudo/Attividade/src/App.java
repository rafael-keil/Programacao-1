import java.util.Scanner;

public class App {

    public static void main(String args[]){

        Scanner leitor = new Scanner(System.in);

        String nome;
        int idade;
        double valor;

        //--------------------- Criando contas e correntistas ------------------

        System.out.println("Digite o nome do Correntista 1: ");
        nome = leitor.nextLine();

        System.out.println("Digite a idade: ");
        idade = leitor.nextInt();
        leitor.nextLine();

        Conta conta1 = new Conta();
        Correntista corr1 = new Correntista(nome, idade);
        conta1.setCorr(corr1);

        System.out.println("Digite o nome do Correntista 2: ");
        nome = leitor.nextLine();

        System.out.println("Digite a idade: ");
        idade = leitor.nextInt();
        leitor.nextLine();

        Conta conta2 = new Conta();
        Correntista corr2 = new Correntista(nome, idade);
        conta2.setCorr(corr2);

        conta1.setNumero(31);
        conta2.setNumero(38);

        conta1.depositar(500);

        conta1.transferir(200, conta2);

        conta1.extrato();
        conta2.extrato();

    }

}