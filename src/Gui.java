import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    JFrame mainFrame;
    JFrame enterFrame;
    public static   String s;
    public void goGui() {
        mainFrame = new JFrame("SuperGame");
        mainFrame.setResizable(false);
        mainFrame.setSize(500, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
      //  mainFrame.setBackground(new Color(137,162,54));
        mainFrame.getContentPane().setBackground(new Color(137,162,54));

        JButton beginButton = new JButton("Начать игру");
        mainFrame.add(beginButton) ;
        beginButton.setForeground(Color.WHITE);
        beginButton.setBackground(new Color(62,81,0));
        beginButton.setBounds(145,125,200,50);
        beginButton.addActionListener( new ListenerForJOpPan());
    }
    public class ListenerForJOpPan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
          s = JOptionPane.showInputDialog("Введите ваше имя");
          mainFrame.dispose();
            goEnterGui();
        }
    }
    public void goEnterGui() {
        enterFrame = new JFrame("Enter Screen");
        enterFrame.setSize(500, 500);
        enterFrame.setResizable(false);
        enterFrame.setLocationRelativeTo(null);
        enterFrame.setVisible(true);
        enterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        enterFrame.setLayout(null);

        JButton b1 = new JButton("Info");
        JButton b2 = new JButton("Грабить корованы");
        JButton b3 = new JButton("Рынок");
        JLabel label = new JLabel();
        label.setText("Вы начинающий грабитель корованов "+s);

        enterFrame.add(label);
       enterFrame.add(b1);
        enterFrame.add(b2);
        enterFrame.add(b3);

        label.setBounds(120,20,400,50);
        b1.setBounds(145,60,200,30);
        b2.setBounds(145,100,200,30);
        b3.setBounds(145,140,200,30);

        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.DARK_GRAY);

        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.DARK_GRAY);

        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.DARK_GRAY);

        b1.addActionListener(new InfoListenere());

    }
    public void goInfoFrame(){
        JFrame  infoFrame = new JFrame("Enter Screen");
        infoFrame.setResizable(false);
        infoFrame.setSize(300, 300);
        infoFrame.setLocationRelativeTo(null);
        infoFrame.setVisible(true);
        infoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        infoFrame.setLayout(null);

    }
    public  class InfoListenere  implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            goInfoFrame();
        }
    }

}
