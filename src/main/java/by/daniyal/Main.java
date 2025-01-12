package by.daniyal;

public class Main {
    public static void main(String[] args) {
        Roulette roulette = new Roulette();
        Game game = new Game(roulette);
        game.start();
    }
}

