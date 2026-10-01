package practice5.task2;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

public class DrawPanel extends JPanel {
    private Shape[] shapes = new Shape[20];

    public DrawPanel() {
        setPreferredSize(new Dimension(600, 400));
        setBackground(Color.WHITE);

        Random rand = new Random();
        for (int i = 0; i < shapes.length; i++) {
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            int x = rand.nextInt(500);
            int y = rand.nextInt(300);
            int size = 20 + rand.nextInt(60);
            int type = rand.nextInt(2);

            if (type == 0) {
                shapes[i] = new Circle(color, x, y, size / 2);
            } else  {
                shapes[i] = new Rectangle(color, x, y, size, 20 + rand.nextInt(60));
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapes) {
            s.draw(g);
        }
    }
}