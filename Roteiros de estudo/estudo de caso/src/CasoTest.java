import javax.swing.JFrame;

public class CasoTest {

    public static void main(String[] args){

        Caso panel = new Caso();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);
        application.setSize(250,250);
        application.setVisible(true);

    }

}
