import Models.Enemy;
import Models.Player;

public class Logic {
    Player player = new Player();
    Enemy enemy;


    public void createGame() {
        player.setLvl(1);
        player.setGold(2000);
        player.setRespect(100);
        System.out.println("player name "+player.getName());
        System.out.println("lvl "+player.getLvl());
        System.out.println("gold "+player.getGold());
        System.out.println("respect "+player.getRespect());
    }
}
