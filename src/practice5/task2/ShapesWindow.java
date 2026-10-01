package practice5.task2;

import javax.swing.JFrame;

public class ShapesWindow {
    public static void main(String[] args) {
        JFrame frame = new JFrame("20 случайных фигур");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawPanel panel = new DrawPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}