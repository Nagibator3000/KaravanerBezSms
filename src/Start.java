import Models.Enemy;
import Models.Player;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Start {
    static Player player;

    public static void main(String[] args) throws IOException {
        Gui myGui = new Gui();
        myGui.goGui();
        player = new Player(Gui.playerName);
        player.gold = 2000;
        player.lvl = 1;
        player.respect = 20;

    }



}
