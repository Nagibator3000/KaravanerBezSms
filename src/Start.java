import Models.Enemy;
import Models.Player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Start {
    static Player player;
    static Enemy enemy = new Enemy(1, 1000, 10);
    static Gui myGui;

    public static void main(String[] args) throws IOException {
        Gui myGui = new Gui();
        myGui.goGui();
        player = new Player();
        player.gold = 5000;
        player.lvl = 2;
        player.respect = 20;


    }

    public static void createEnemy() {
        switch (player.lvl) {
            case 1:
                double randomNum = Math.random();
                if (randomNum < 0.8) {
                    enemy.gold = 1000;
                    enemy.lvl = 1;
                    enemy.power = 10;
                } else {
                    enemy.gold = 2000;
                    enemy.lvl = 2;
                    enemy.power = 20;
                }
                break;
            case 2:

                randomNum = Math.random();
                if (randomNum < 0.4) {
                    enemy.gold = 1000;
                    enemy.lvl = 1;
                    enemy.power = 10;
                } else {
                    if (randomNum < 0.85) {
                        enemy.gold = 2000;
                        enemy.lvl = 2;
                        enemy.power = 20;
                    } else {
                        enemy.gold = 3000;
                        enemy.lvl = 3;
                        enemy.power = 30;
                    }
                }


        }
    }

    public String printEnemyInfo() {

        String s = String.valueOf(enemy.lvl + "  " + enemy.gold);
        return s;
    }


}
