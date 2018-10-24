package c9_innerclass;
import com.sun.xml.internal.ws.api.server.SDDocument;

import java.util.Random;

interface Games {
    void play();
}

interface GamesFactory {
    Games getGames();
}

class CoinToss implements Games {
    private CoinToss(){}
    Random rand = new Random();
    public void play() {
        System.out.print("Toss Coin: ");
        switch(rand.nextInt(2)) {
            case 0 : System.out.print("Heads"); return;
            case 1 : System.out.print("Tails"); return;
            default: System.out.print("OnEdge"); return;
        }
    }

    public static GamesFactory factory = new GamesFactory() {
        @Override
        public Games getGames() {
            return new CoinToss();
        }
    };
}

class DiceThrow implements Games {
    Random rand = new Random();

    public void play() {
        System.out.println("Throw Dice: " + (rand.nextInt(6) + 1));
    }

    public static GamesFactory factory = new GamesFactory() {
        @Override
        public Games getGames() {
            return new DiceThrow();
        }
    };
}

public class E17_Game {
    public static void playGame(GamesFactory factory) {
        Games g = factory.getGames();
        g.play();
    }

    public static void main(String[] args) {
        playGame(CoinToss.factory);
        playGame(DiceThrow.factory);
    }
}
