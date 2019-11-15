import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Surface extends JPanel {
    int a=1;

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.setFont(new Font("Serif", Font.PLAIN,15));
        for(int i=0;i<2;i++) {
           if(i==0) {
               g2d.drawString("Java\n 2D", 50, 50);
           }
            else{
                g2d.drawRect(40, 40, 100, 100);
           }
        }
        }

    @Override
    public void paintComponent(Graphics g) {

        //super.paintComponent(g);
        doDrawing(g);
    }
}

public class BasicEx extends JFrame {

    public BasicEx() {

        initUI();
    }

    private void initUI() {

        add(new Surface());

        setTitle("Simple Java 2D example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                BasicEx ex = new BasicEx();
                ex.setVisible(true);
            }
        });
    }
}