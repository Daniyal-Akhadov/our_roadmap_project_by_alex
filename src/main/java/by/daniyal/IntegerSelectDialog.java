package by.daniyal;

import java.util.List;
import java.util.Scanner;

public class IntegerSelectDialog implements Dialog<Integer> {
    private final String title;
    private final String error;
    private final List<Integer> keysValues;

    public IntegerSelectDialog(String title, String error, List<Integer> keysValues) {
        this.title = title;
        this.error = error;
        this.keysValues = keysValues;
    }

    @Override
    public Integer input() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(title);
            String key = scanner.nextLine();

            if (isInteger(key)) {
                int number = Integer.parseInt(key);

                if (keysValues.contains(number)) {
                    return number;
                }
            }

            System.out.println(error);
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
