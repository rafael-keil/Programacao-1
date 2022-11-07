import javax.swing.JPanel;
import java.awt.Graphics;

public class Caso extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        int x = 0;

        while(x <= height){

            g.drawLine(0, x, x+15, height);
            g.drawLine(width, x, width-x, height);
            g.drawLine(0, height-x, x+15, 0);
            g.drawLine(width, height-x, width-x, 0);

            x += 15;
        }
        //g.drawLine(0, 0, width, height);
        //g.drawLine(0, height, width, 0);

    }
}