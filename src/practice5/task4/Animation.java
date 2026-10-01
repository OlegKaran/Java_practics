package practice5.task4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Animation {
    static BufferedImage[] frames;
    static int current = 0;

    public static void main(String[] args) throws IOException {
        String path = "/Users/mac/Downloads/screen.png";
        int frameCount = 4;

        BufferedImage sheet = ImageIO.read(new File(path));
        if (sheet == null) {
            System.out.println("Не удалось загрузить картинку: " + path);
            return;
        }

        int frameWidth = sheet.getWidth() / frameCount;
        int frameHeight = sheet.getHeight();

        frames = new BufferedImage[frameCount];
        for (int i = 0; i < frameCount; i++) {
            frames[i] = sheet.getSubimage(i * frameWidth, 0, frameWidth, frameHeight);
        }

        JFrame frame = new JFrame("Анимация");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(new ImageIcon(frames[0]));
        frame.getContentPane().add(label);

        frame.pack();
        frame.setVisible(true);

        Timer timer = new Timer(100, e -> {
            current = (current + 1) % frameCount;
            label.setIcon(new ImageIcon(frames[current]));
        });
        timer.start();
    }
}