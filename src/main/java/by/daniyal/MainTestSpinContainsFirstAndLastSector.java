package by.daniyal;

/**
 * Hello world!
 */
public class MainTestSpinContainsFirstAndLastSector {
    public static void main(String[] args) {
        Roulette roulette = new Roulette();

        for (int i = 0; i < 1_000; i++) {
            int spinNumber = roulette.spin();

            if (spinNumber == roulette.getFirstSector() || spinNumber == roulette.getLastSector()) {
                System.out.println(spinNumber);
            }
        }
    }
}

