import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Gui {
    Logic logic = new Logic();

    JFrame enterNameFrame;
    JFrame startFrame;
    JFrame enterFrame;
    JFrame mainMenuFrame;
    JPanel mainPanel;
    JButton skipButton;
    private JTextField enterNameTextField;
    private JTextField enemyLvlTextField;
    private JTextField enemyGoldTextField;
    private JButton robKorovanButton;
    private JFrame enemyInfoFrame;
    private JButton infoEnemyButton;
    private JTextArea resultRob;
    private JProgressBar goldProgress;

    public void goGui() {
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

    public class BeginButtonListener implements ActionListener {
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
        enterNameFrame.getContentPane().setBackground(new Color(137, 152, 64));

        JLabel enterNameLabel = new JLabel("ВВЕДИТЕ ВАШЕ ИМЯ");
        enterNameTextField = new JTextField("Имя");
        JButton readNameButton = new JButton("Ок");

        enterNameFrame.add(enterNameLabel);
        enterNameFrame.add(enterNameTextField);
        enterNameFrame.add(readNameButton);

        enterNameLabel.setBounds(40, 10, 120, 20);
        enterNameTextField.setBounds(40, 50, 120, 20);
        readNameButton.setBounds(75, 95, 50, 20);

        readNameButton.addActionListener(new ReadNameButtonListener());
    }

    public class ReadNameButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            logic.player.setName(enterNameTextField.getText());
            enterNameFrame.dispose();
            startFrame.dispose();
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

        JButton b1 = new JButton("Info(TODO)");
        JButton goActionButton = new JButton("Грабить корованы");
        JButton b3 = new JButton("Рынок(TODO)");

        JLabel label = new JLabel();
        label.setText("Вы начинающий грабитель корованов " + logic.player.getName());

        enterFrame.add(label);
        enterFrame.add(b1);
        enterFrame.add(goActionButton);
        enterFrame.add(b3);

        label.setBounds(120, 20, 400, 50);
        b1.setBounds(145, 60, 200, 30);
        goActionButton.setBounds(145, 100, 200, 30);
        b3.setBounds(145, 140, 200, 30);

        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.DARK_GRAY);

        goActionButton.setForeground(Color.WHITE);
        goActionButton.setBackground(Color.DARK_GRAY);

        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.DARK_GRAY);

        goActionButton.addActionListener(new GoActionButtonListener());

    }

    public class GoActionButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            enterFrame.setVisible(false);
            goActionFrame();
        }
    }

/*    public void goInfoFrame() {
        infoFrame = new JFrame("Enter Screen");
        infoFrame.setResizable(false);
        infoFrame.setSize(300, 300);
        infoFrame.setLocationRelativeTo(null);
        infoFrame.setVisible(true);
        infoFrame.setLayout(null);
        JButton b = new JButton("ok");
        infoFrame.add(b);
        b.setBounds(100, 100, 100, 100);
    }*/


    private void goActionFrame() {
        mainMenuFrame = new JFrame("SuperGame");
        mainMenuFrame.setResizable(false);
        mainMenuFrame.setSize(500, 380);
        mainMenuFrame.setLocationRelativeTo(null);
        mainMenuFrame.setVisible(true);
        mainMenuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainMenuFrame.setLayout(null);

        JPanel headerPanel = new JPanel(null);
        headerPanel.setBackground(new Color(200, 200, 64));
        headerPanel.setBounds(0, 0, 500, 80);

        JPanel headerLeftPanel = new JPanel(null);
        headerLeftPanel.setBackground(new Color(167, 33, 200));
        headerLeftPanel.setBounds(10, 5, 230, 70);

        JPanel headerRightPanel = new JPanel(null);
        headerRightPanel.setBackground(new Color(157, 200, 173));
        headerRightPanel.setBounds(260, 5, 230, 70);

        goldProgress = new JProgressBar();
        goldProgress.setMinimum(0);
        goldProgress.setMaximum(50000);
        goldProgress.setStringPainted(true);
        goldProgress.setValue(logic.player.getGold());

        JPanel panelButton = new JPanel(null);
        panelButton.setBackground(new Color(137, 152, 64));
        panelButton.setBounds(0, 300, 500, 80);

        skipButton = new JButton();
        skipButton.setText("Начать");
        robKorovanButton = new JButton("Ограбить");
        robKorovanButton.setVisible(false);
        JButton backButton = new JButton("К меню");

        mainPanel = new JPanel(null);
        mainPanel.setBackground(new Color(62, 81, 0));
        mainPanel.setBounds(0, 80, 500, 220);

        JPanel korovanPanel = new JPanel(null);
        korovanPanel.setBackground(new Color(152, 147, 155));
        korovanPanel.setBounds(10, 10, 235, 200);

        resultRob = new JTextArea();
        JScrollPane jScrollPane = new JScrollPane(resultRob);
        jScrollPane.setPreferredSize(new Dimension(100, 100));
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane.setBackground(new Color(152, 147, 155));
        jScrollPane.setBounds(255, 10, 230, 200);

        JLabel enemyLvlLabel = new JLabel("Уровень корована");
        JLabel enemyGoldLabel = new JLabel("Золото корована");

        enemyLvlTextField = new JTextField();
        enemyLvlTextField.setEditable(false);
        enemyGoldTextField = new JTextField();
        enemyGoldTextField.setEditable(false);

        infoEnemyButton = new JButton("Инфо о короване");

        korovanPanel.add(enemyLvlLabel);
        korovanPanel.add(enemyGoldLabel);
        korovanPanel.add(enemyLvlTextField);
        korovanPanel.add(enemyGoldTextField);
        korovanPanel.add(infoEnemyButton);

        enemyLvlLabel.setBounds(35, 35, 110, 20);
        enemyLvlTextField.setBounds(175, 35, 50, 20);
        enemyGoldLabel.setBounds(35, 90, 110, 20);
        enemyGoldTextField.setBounds(175, 90, 50, 20);
        infoEnemyButton.setBounds(50, 145, 135, 20);
        infoEnemyButton.addMouseListener(new InfoEnemyListener());
        infoEnemyButton.setVisible(false);

        headerPanel.add(headerLeftPanel);
        headerPanel.add(headerRightPanel);

        headerRightPanel.add(goldProgress);

        mainPanel.add(korovanPanel);
        mainPanel.add(jScrollPane);

        panelButton.add(skipButton);
        panelButton.add(robKorovanButton);
        panelButton.add(backButton);

        mainMenuFrame.add(panelButton);
        mainMenuFrame.add(mainPanel);
        mainMenuFrame.add(headerPanel);

        goldProgress.setBounds(20, 20, 100, 20);

        skipButton.setBounds(330, 10, 120, 30);
        robKorovanButton.setBounds(200, 10, 100, 30);
        backButton.setBounds(70, 10, 100, 30);
        robKorovanButton.addActionListener(new RobKorovanListener());
        skipButton.addActionListener(new SkipButtonListener());
        backButton.addActionListener(new BackButtonListener());

    }

    public class InfoEnemyListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
            goEnemyInfoFrame();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            enemyInfoFrame.setVisible(false);
        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    private void goEnemyInfoFrame() {
        enemyInfoFrame = new JFrame("SuperGame");
        enemyInfoFrame.setResizable(false);
        enemyInfoFrame.setSize(220, 100);
        enemyInfoFrame.setLocationRelativeTo(null);
        enemyInfoFrame.setVisible(true);
        enemyInfoFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        enemyInfoFrame.setLayout(null);

        JLabel label = new JLabel("Шанс удачного ограбления: " + logic.chance * 100 + "%");
        enemyInfoFrame.add(label);

        label.setBounds(0, 0, 210, 50);
    }

    public class RobKorovanListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            resultRob.setText(resultRob.getText() + logic.nextProcess(2));
            enemyLvlTextField.setText(String.valueOf(logic.enemy.getLvl()));
            enemyGoldTextField.setText(String.valueOf(logic.enemy.getGold()));
            goldProgress.setValue(logic.player.getGold());
            System.out.println(goldProgress.getValue());
        }
    }

    public class SkipButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (skipButton.getText().equals("Начать")) {
                skipButton.setText("Следующий");
                infoEnemyButton.setVisible(true);
                logic.createEnemy();
                enemyLvlTextField.setText(String.valueOf(logic.enemy.getLvl()));
                enemyGoldTextField.setText(String.valueOf(logic.enemy.getGold()));
                robKorovanButton.setVisible(true);
            } else {
                resultRob.setText(resultRob.getText() + logic.nextProcess(1));
                enemyLvlTextField.setText(String.valueOf(logic.enemy.getLvl()));
                enemyGoldTextField.setText(String.valueOf(logic.enemy.getGold()));
                goldProgress.setValue(logic.player.getGold());
                System.out.println(goldProgress.getValue());

            }
        }
    }

    public class BackButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mainMenuFrame.setVisible(false);
            enterFrame.setVisible(true);
        }
    }

}


