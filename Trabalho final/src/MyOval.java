import java.awt.*;

public class MyOval extends MyShape{

    public MyOval(int x1, int y1, int x2, int y2, Color cor, Boolean preenchido) {
        super(x1, y1, x2, y2, cor, preenchido);
    }

    public void draw(Graphics g){
        g.setColor(getCor());
        g.drawOval(getUpperLeftX(), getUpperLeftZ(), getWidth(), getHeight());
        if(getPreenchido()){
            g.fillOval(getUpperLeftX(), getUpperLeftZ(), getWidth(), getHeight());
        }
    }
}
