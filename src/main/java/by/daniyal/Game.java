package by.daniyal;

import static by.daniyal.Roulette.FIRST_SECTOR;
import static by.daniyal.Roulette.LAST_SECTOR;

public class Game {
    private final Roulette roulette;
    public static final String BET_SELECTION_TEXT = "Введите ставку: %d - %d: ".formatted(FIRST_SECTOR, LAST_SECTOR);


    public Game(Roulette roulette) {
        this.roulette = roulette;
    }

    public void start() {
        System.out.println("********************");
        System.out.println("Рулетка");
        System.out.printf("Секторы: %d - %d %n", roulette.getFirstSector(), roulette.getLastSector());
        System.out.println("********************");

        Dialog<Integer> dialog = new IntegerMinMaxDialog(BET_SELECTION_TEXT, "Error!", FIRST_SECTOR, LAST_SECTOR);

        int betSector = dialog.input();
        System.out.println(betSector);
        int winnerSector = roulette.spin();

        if (winnerSector == betSector) {
            System.out.println("Вы победили!");
        } else {
            System.out.printf("Выиграшный номер: %d %n", winnerSector);
            System.out.println("Вы проиграли");
        }
    }


}

