import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    JFrame mainFrame;
    JFrame enterFrame;
    JFrame infoFrame;
    public static String playerName;
    JFrame actionFrame;
    Start start;

    public void goGui() {
        mainFrame = new JFrame("SuperGame");
        mainFrame.setResizable(false);
        mainFrame.setSize(500, 500);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLayout(null);
        //  mainFrame.setBackground(new Color(137,162,54));
        mainFrame.getContentPane().setBackground(new Color(137, 162, 54));

        JButton beginButton = new JButton("Начать игру");
        mainFrame.add(beginButton);
        beginButton.setForeground(Color.WHITE);
        beginButton.setBackground(new Color(62, 81, 0));
        beginButton.setBounds(145, 125, 200, 50);
        beginButton.addActionListener(new ListenerForJOpPan());
    }

    public class ListenerForJOpPan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            playerName = JOptionPane.showInputDialog("Введите ваше имя");
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
        label.setText("Вы начинающий грабитель корованов " + playerName);

        enterFrame.add(label);
        enterFrame.add(b1);
        enterFrame.add(b2);
        enterFrame.add(b3);

        label.setBounds(120, 20, 400, 50);
        b1.setBounds(145, 60, 200, 30);
        b2.setBounds(145, 100, 200, 30);
        b3.setBounds(145, 140, 200, 30);

        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.DARK_GRAY);

        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.DARK_GRAY);

        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.DARK_GRAY);

        b1.addActionListener(new InfoListener());
        b2.addActionListener(new GoActionListener());
    }

    public void goInfoFrame() {
        infoFrame = new JFrame("Enter Screen");
        infoFrame.setResizable(false);
        infoFrame.setSize(300, 300);
        infoFrame.setLocationRelativeTo(null);
        infoFrame.setVisible(true);
        infoFrame.setLayout(null);
        JButton b = new JButton("ok");
        infoFrame.add(b);
        b.setBounds(100, 100, 100, 100);
        b.addActionListener(new ExitOnInfoFrame());
    }

    public class ExitOnInfoFrame implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            infoFrame.dispose();
        }
    }

    public class GoActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            goActionFrame();

        }
    }

    private void goActionFrame() {
        int i = 0;
        actionFrame = new JFrame("SuperGame");
        actionFrame.setResizable(false);
        actionFrame.setSize(500, 500);
        actionFrame.setLocationRelativeTo(null);
        actionFrame.setVisible(true);
        actionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        actionFrame.setLayout(null);

        JPanel panelSmartInfo = new JPanel(null);
        panelSmartInfo.setSize(150, 100);
        panelSmartInfo.setBackground(new Color(137, 152, 64));

        JPanel panelButton = new JPanel(null);
        panelButton.setBackground(new Color(137, 152, 64));
        panelButton.setBounds(0, 400, 500, 100);

        JPanel mainPanel = new JPanel(null);
        mainPanel.setBackground(new Color(137, 1, 64));
        mainPanel.setBounds(0, 100, 500, 300);


        JLabel goldLabel = new JLabel("Золото          " + String.valueOf(start.player.gold));
        JLabel lvlLabel = new JLabel("Уровень       " + String.valueOf(start.player.lvl));
        JLabel respectLabel = new JLabel("Уважение    " + String.valueOf(start.player.respect));

        JButton buttonSkip = new JButton();
        buttonSkip.setText("Пропустить");
        JButton robKaravanButton = new JButton("Ограбить");
        JButton button = new JButton("TODO");

        panelSmartInfo.add(goldLabel);
        panelSmartInfo.add(lvlLabel);
        panelSmartInfo.add(respectLabel);

        panelButton.add(buttonSkip);
        panelButton.add(robKaravanButton);
        panelButton.add(button);


        actionFrame.add(panelSmartInfo);
        actionFrame.add(panelButton);
        actionFrame.add(mainPanel);

        goldLabel.setBounds(15, 4, 150, 30);
        lvlLabel.setBounds(15, 34, 150, 30);
        respectLabel.setBounds(15, 64, 150, 30);

        buttonSkip.setBounds(330, 20, 100, 30);
        buttonSkip.addActionListener(new SkipListener());
        robKaravanButton.setBounds(200, 20, 100, 30);
        button.setBounds(70, 20, 100, 30);

        goldLabel.setForeground(Color.white);
        lvlLabel.setForeground(Color.white);
        respectLabel.setForeground(Color.white);

    }

    public class SkipListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
        public void printEnemyOnMainPanel() {
        }

        public class InfoListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {

                goInfoFrame();
            }
        }

    }
