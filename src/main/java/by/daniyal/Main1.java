package by.daniyal;

import java.util.Scanner;

public class Main1 {

    public static final int START = 1;
    public static final int END = 2;
    private static final String ERROR_TEXT = "";
    public static final String MENU_SELECTION_TEXT = "Для начал игры введите: %d\nДля окончания игры введите: %d\n".formatted(Main1.START, Main1.END);

    public static void main(String[] args) {
        Roulette roulette = new Roulette();
        Game game = new Game(roulette);

        Dialog<Integer> dialog = new IntegerMinMaxDialog(MENU_SELECTION_TEXT, ERROR_TEXT, START, END);

        while (true) {
            int sectorNumber = dialog.input();

            if (sectorNumber == START) {
                game.start();
            } else if (sectorNumber == END) {
                break;
            }
        }

        System.out.println("До свидания!");
    }

    public static int inputMenuSelection() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.printf("Для начал игры введите: %d\n", START);
            System.out.printf("Для окончания игры введите: %d\n", END);

            String key = scanner.nextLine();

            if (isInteger(key)) {
                int number = Integer.parseInt(key);

                if (number == START || number == END) {
                    return number;
                }
            }

            System.out.println("Ошибка ввода!");
        }
    }

    private static boolean isInteger(String key) {
        try {
            Integer.parseInt(key);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

