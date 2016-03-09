import javax.swing.*;
import java.awt.*;

public class Gui {
    JFrame mainFrame;

    public void goGui() {
        mainFrame = new JFrame("SuperGame");
        mainFrame.setSize(500, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);

        JLabel label = new JLabel("Вы начинающий грабитель корованов");
        mainFrame.add(label);

        Insets insets = mainFrame.getInsets();
        label.setBounds(55+insets.left, 5+insets.top,400,100);
    }

}
