import Models.Enemy;
import Models.Player;

public class Logic {
    Player player = new Player();
    Enemy enemy = new Enemy();
    float chance = 0;

    public void createGame() {
        player.setLvl(1);
        player.setGold(2000);
        player.setRespect(100);
        System.out.println("player name " + player.getName());
        System.out.println("lvl " + player.getLvl());
        System.out.println("gold " + player.getGold());
        System.out.println("respect " + player.getRespect());
    }

    public void createEnemy() {
        enemy.setLvl(1);
        calcGold();
        calcChance();
    }

    public void nextProcess(int i) {
        createEnemy();
        update(i);
    }

    private void calcGold() {
        enemy.setGold(1000 + (0 + (int) (Math.random() * ((10 - 0) + 1))) * 100);
    }

    private void calcChance() {
        chance = (float) (1 * 0.75);
        System.out.println(chance);

    }

    public void update(int i) {
        if (i == 1) {
            skipEnemy();
        } else {

            int y = 0 + (int)(Math.random() * ((100 - 0) + 1)) ;
            System.out.println(y);
            System.out.println(y);
            if (y > (chance*100)) {
                failedRobEnemy();
            } else {
                robEnemy();
            }

        }
    }

    private void failedRobEnemy() {
        System.out.println("Не удалось Ограбить!");
        player.setGold(player.getGold() - 300);
        player.setRespect(player.getRespect() - 20);
        System.out.println("Player gold " + player.getGold());
        System.out.println("Player respect " + player.getRespect());

    }

    private void robEnemy() {

        player.setGold(player.getGold() + enemy.getGold());
        player.setGold(player.getGold() - 300);
        player.setRespect(player.getRespect() - 20);
        System.out.println("Player gold " + player.getGold());
        System.out.println("Player respect " + player.getRespect());
    }

    private void skipEnemy() {
        player.setGold(player.getGold() - 300);
        player.setRespect(player.getRespect() + 10);
        System.out.println("Player gold " + player.getGold());
        System.out.println("Player respect " + player.getRespect());
    }


}
