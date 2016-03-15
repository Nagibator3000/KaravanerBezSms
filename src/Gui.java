import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
     Logic logic = new Logic();

    JFrame enterNameFrame;
    JFrame startFrame;
    JFrame enterFrame;
    JFrame infoFrame;
    JFrame actionFrame;

    JLabel enemyInfoLvl;
    JPanel mainPanel;
    JLabel enemyInfoGold;
    JPanel panelSmartInfo;
    JLabel respectLabel;
    JLabel lvlLabel;
    JLabel goldLabel;
    JButton buttonSkip;
    private JTextField enterNameTextField;

    public  void goGui() {
        startFrame = new JFrame("SuperGame");
        startFrame.setResizable(false);
        startFrame.setSize(500, 500);
        startFrame.setLocationRelativeTo(null);
        startFrame.setVisible(true);
        startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        startFrame.setLayout(null);
        startFrame.getContentPane().setBackground(new Color(137, 162, 54));

        JButton beginButton = new JButton("Начать игру");
        startFrame.add(beginButton);
        beginButton.setForeground(Color.WHITE);
        beginButton.setBackground(new Color(62, 81, 0));
        beginButton.setBounds(145, 125, 200, 50);
        beginButton.addActionListener(new BeginButtonListener());
    }
    public  class  BeginButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            goEnterNameFrame();
        }
    }

    private void goEnterNameFrame() {
        enterNameFrame = new JFrame("Enter Name");
        enterNameFrame.setResizable(false);
        enterNameFrame.setSize(200, 160);
        enterNameFrame.setLocationRelativeTo(null);
        enterNameFrame.setVisible(true);
        enterNameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        enterNameFrame.setLayout(null);
        enterNameFrame.getContentPane().setBackground(new Color(137,152,64));

        JLabel enterNameLabel = new JLabel("ВВЕДИТЕ ВАШЕ ИМЯ");
        enterNameTextField = new JTextField("Имя");
        JButton readNameButton = new JButton("Ок");

        enterNameFrame.add(enterNameLabel);
        enterNameFrame.add(enterNameTextField);
        enterNameFrame.add(readNameButton);

        enterNameLabel.setBounds(40,10,120,20);
        enterNameTextField.setBounds(40,50,120,20);
        readNameButton.setBounds(75,95,50,20);

        readNameButton.addActionListener(new ReadNameButtonListener());
    }

    public class ReadNameButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           logic.player.setName(enterNameTextField.getText());
            enterNameFrame.dispose();
            logic.createGame();
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
        label.setText("Вы начинающий грабитель корованов ");

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
    }


    private void goActionFrame() {
        actionFrame = new JFrame("SuperGame");
        actionFrame.setResizable(false);
        actionFrame.setSize(500, 500);
        actionFrame.setLocationRelativeTo(null);
        actionFrame.setVisible(true);
        actionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        actionFrame.setLayout(null);

        panelSmartInfo = new JPanel(null);
        panelSmartInfo.setSize(150, 100);
        panelSmartInfo.setBackground(new Color(137, 152, 64));

        JPanel panelButton = new JPanel(null);
        panelButton.setBackground(new Color(137, 152, 64));
        panelButton.setBounds(0, 400, 500, 100);

        mainPanel = new JPanel(null);
        mainPanel.setBackground(new Color(137, 152, 64));
        mainPanel.setBounds(0, 100, 500, 300);

        enemyInfoLvl = new JLabel();

        enemyInfoGold = new JLabel();
        enemyInfoGold.setForeground(Color.white);
        enemyInfoLvl.setForeground(Color.white);


        buttonSkip = new JButton();
        buttonSkip.setText("Начать");
        JButton robKaravanButton = new JButton("Ограбить");
        JButton button = new JButton("TODO");

        mainPanel.add(enemyInfoLvl);
        mainPanel.add(enemyInfoGold);

        panelSmartInfo.add(goldLabel);
        panelSmartInfo.add(lvlLabel);
        panelSmartInfo.add(respectLabel);

        panelButton.add(buttonSkip);
        panelButton.add(robKaravanButton);
        panelButton.add(button);


        actionFrame.add(panelSmartInfo);
        actionFrame.add(panelButton);
        actionFrame.add(mainPanel);


        enemyInfoGold.setBounds(0, 0, 200, 20);
        enemyInfoLvl.setBounds(0, 30, 200, 20);

        goldLabel.setBounds(15, 4, 150, 30);
        lvlLabel.setBounds(15, 34, 150, 30);
        respectLabel.setBounds(15, 64, 150, 30);

        buttonSkip.setBounds(330, 20, 120, 30);
        robKaravanButton.setBounds(200, 20, 100, 30);
        button.setBounds(70, 20, 100, 30);


        goldLabel.setForeground(Color.white);
        lvlLabel.setForeground(Color.white);
        respectLabel.setForeground(Color.white);

    }

}


