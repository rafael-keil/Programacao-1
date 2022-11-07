import javax.swing.*;

public class TestDraw {
    public static void main(String[] args) {
        DrawPanel painel = new DrawPanel();
        JFrame app = new JFrame();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.add(painel);
        app.setSize(300, 300);
        app.setVisible(true);
    }
}
