import Models.Enemy;
import Models.Player;

public class Logic {
    Player player = new Player();
    Enemy enemy = new Enemy();


    public void createGame() {
        player.setLvl(1);
        player.setGold(2000);
        player.setRespect(100);
        System.out.println("player name "+player.getName());
        System.out.println("lvl "+player.getLvl());
        System.out.println("gold "+player.getGold());
        System.out.println("respect "+player.getRespect());
    }

    public void createEnemy() {
        enemy.setLvl(1);
        enemy.setGold(1000);
    }

    public void goNext() {
        createEnemy();
        update();
    }

    public void update() {
        player.setGold(player.getGold()-300);
        System.out.println("Player gold "+player.getGold());
    }
}
