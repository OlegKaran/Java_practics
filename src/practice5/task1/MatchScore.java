package practice5.task1;

import java.awt.*;
import javax.swing.*;

public class MatchScore {
    static int milanScore = 0;
    static int madridScore = 0;
    static JLabel resultLabel = new JLabel("Result: 0 X 0", JLabel.CENTER);
    static JLabel scorerLabel = new JLabel("Last Scorer: N/A", JLabel.CENTER);
    static JLabel winnerLabel = new JLabel("Winner: DRAW", JLabel.CENTER);
    public static void main(String[] args) {
        JFrame frame = new JFrame("Милан vs Мадрир");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.setBackground(Color.GRAY);
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        milanButton.addActionListener(e -> {
            milanScore++;
            scorerLabel.setText("Last Scorer: AC Milan");
            updateLabels();
        });

        madridButton.addActionListener(e -> {
            madridScore++;
            scorerLabel.setText("Last Scorer: Real Madrid");
            updateLabels();
        });

        panel.add(milanButton);
        panel.add(madridButton);
        panel.add(resultLabel);
        panel.add(scorerLabel);
        panel.add(winnerLabel);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }

    static void updateLabels() {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);

        if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else if (madridScore > milanScore) {
            winnerLabel.setText("Winner: Real Madrid");
        } else {
            winnerLabel.setText("Winner: DRAW");
        }
    }
}
