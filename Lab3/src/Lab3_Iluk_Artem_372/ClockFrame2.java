package Lab3_Iluk_Artem_372;

import javax.swing.*;
import java.awt.*;

public class ClockFrame2 {

    JFrame frame;
    JLabel label;

    public ClockFrame2() {
        frame = new JFrame("Лабораторна робота 3: Електронний Годинник");
        label = new JLabel();

        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setFont(new Font("Monospaced", Font.BOLD, 22));

        frame.add(label, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ClockExt2 clock = new ClockExt2(0, 0, 0, 0);

        label.setText(clock.toString());

        Timer timer = new Timer(100, e -> {
            clock.nextMillisecond();
            label.setText(clock.toString());
        });

        timer.start();

        frame.pack();
        frame.setSize(800, 100);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}