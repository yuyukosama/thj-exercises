package c6_reusing_classes;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        // print("BoardGame constructor"); // call to super must be first
        // statement in constructor
        super(i); // else: "cannot find symbol: constructor Game()
        System.out.println("BoardGame constructor");
    }
}

public class E06_Chess extends BoardGame {

    public E06_Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        E06_Chess chess = new E06_Chess();
    }
}
