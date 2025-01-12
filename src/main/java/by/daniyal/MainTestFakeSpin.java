package by.daniyal;

public class MainTestFakeSpin {
    public static void main(String[] args) {
        Roulette roulette = new Roulette() {
            @Override
            public int spin() {
                return 16;
            }
        };

        Game game = new Game(roulette);
        game.start();
    }
}
