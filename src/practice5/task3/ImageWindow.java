package practice5.task3;

import javax.swing.*;
import java.io.File;

public class ImageWindow {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Укажите путь к картинке в аргументах командной строки");
            return;
        }

        String path = args[0];

        if (!new File(path).exists()) {
            System.out.println("Файл не найден: " + path);
            return;
        }

        ImageIcon icon = new ImageIcon(path);

        JFrame frame = new JFrame("Картинка");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(icon);
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);
    }
}