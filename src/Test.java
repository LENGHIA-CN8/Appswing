import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Test {

    public static void main(String... args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        for (int i = 0; i < 10; i++) {
            panel.add(new JButton("Hello-" + i));
        }
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(50, 50, 300, 100);
        scrollPane.setPreferredSize(new Dimension(500,400));
        //JPanel contentPane = new JPanel(null);
        //contentPane.setPreferredSize(new Dimension(500, 400));
        //contentPane.add(scrollPane);
        //frame.setContentPane(contentPane);
        frame.add(scrollPane);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }
}