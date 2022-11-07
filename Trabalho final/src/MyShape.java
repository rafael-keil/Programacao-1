import java.awt.*;

public abstract class MyShape {

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;
    private final Color cor;
    private final Boolean preenchido;

    public MyShape(int x1, int y1, int x2, int y2, Color cor, Boolean preenchido) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.cor = cor;
        this.preenchido = preenchido;
    }

    public int getUpperLeftX(){
        return Math.min(x1, x2);
    }

    public int getUpperLeftZ(){
        return Math.min(y1, y2);
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public Color getCor() {
        return cor;
    }

    public Boolean getPreenchido() {
        return preenchido;
    }

    public int getWidth(){
        return Math.abs(x1 - x2);
    }

    public int getHeight(){
        return Math.abs(y1 - y2);
    }

    public abstract void draw(Graphics g);
}
