import javax.swing.*;
import java.awt.*;

public class StartmenuGui extends JFrame {
    private JPanel jps = new JPanel();
    private JPanel center = new JPanel();
    private JPanel south = new JPanel();
    private JButton newGame = new JButton("New game");
    private JLabel welcomeText = new JLabel("Welcome to Quizkampen!");


    public StartmenuGui() {
        setTitle("Quizkampen");

        this.add(jps);
        jps.setLayout(new BorderLayout());


        //Sätter welcomeText position
        jps.add(center);
        center.setLayout(new FlowLayout(FlowLayout.CENTER));
        center.add(welcomeText);



        jps.add(south, BorderLayout.SOUTH);
        south.setLayout(new FlowLayout(FlowLayout.CENTER));
        south.add(newGame);

        pack();
        setSize(300,150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
