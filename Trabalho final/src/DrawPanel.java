import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class DrawPanel extends JPanel {

    private final ArrayList<MyShape> forma = new ArrayList<>();

    public DrawPanel(){
        setBackground(Color.WHITE);

        for(int i = 0; i < 15; i++){

            Random rand = new Random();

            int x1 = rand.nextInt(300);
            int y1 = rand.nextInt(300);
            int x2 = rand.nextInt(300);
            int y2 = rand.nextInt(300);

            Color cor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            boolean preenchido = rand.nextBoolean();

            int tipo = rand.nextInt(3);

            switch(tipo) {
                case 0:
                    forma.add(new MyLine(x1,y1,x2, y2, cor, preenchido));
                    break;
                case 1:
                    forma.add(new MyOval(x1,y1,x2, y2, cor, preenchido));
                    break;
                case 2:
                    forma.add(new MyRectangle(x1,y1,x2, y2, cor, preenchido));
                    break;
            }
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        for(MyShape forma : forma){
            forma.draw(g);
        }
    }

}
