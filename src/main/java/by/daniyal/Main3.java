package by.daniyal;

import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        Dialog<Integer> dialog = new IntegerSelectDialog(
                "Введите число 7, 11, 12",
                "Error",
                List.of(7, 11, 12)
        );

        Integer input = dialog.input();
        System.out.println(input);
    }
}
