import java.awt.*;

public class MyLine extends MyShape{

    public MyLine(int x1, int y1, int x2, int y2, Color cor, Boolean preenchido) {
        super(x1, y1, x2, y2, cor, preenchido);
    }

    public void draw(Graphics g ){
        g.setColor(getCor());
        g.drawLine(getX1(), getY1(), getX2(), getY2());
    }
}
