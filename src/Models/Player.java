package Models;

public class Player {
    public String name;
    int lvl;
    int respect;
    int gold;

    public String getName() {
        return name;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getRespect() {
        return respect;
    }

    public void setRespect(int respect) {
        this.respect = respect;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setName(String name) {
        this.name = name;
    }
}
