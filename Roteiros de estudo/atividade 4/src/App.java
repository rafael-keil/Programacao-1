import java.io.PrintStream;

public class App {


    public static void main (String[] args){

        Programador p1 = new Programador("Rafael","4524");
        p1.setLinguagem(new String[]{"c++", "java", "portugol"});
        p1.setData(new int[]{30,20,2});

        Programador p2 = new Programador("jonas","4236");
        p2.setLinguagem(new String[]{"java", "uga", "c++"});
        p2.setData(new int[]{3,23,12});

        Programador p3 = new Programador("pedro", "4576");
        p3.setLinguagem(new String[]{"c++", "turing", "java"});
        p3.setData(new int[]{24,20,19});

        System.out.println(p1);
    }


}
