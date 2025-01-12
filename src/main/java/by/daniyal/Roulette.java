package by.daniyal;

import java.util.Random;

public class Roulette {
    public static final int FIRST_SECTOR = 0;
    public static final int LAST_SECTOR = 36;

    public int getFirstSector() {
        return FIRST_SECTOR;
    }

    public int getLastSector() {
        return LAST_SECTOR;
    }

    public int spin() {
        Random random = new Random();
        int randomNumber = random.nextInt(LAST_SECTOR - FIRST_SECTOR + 1);
        return randomNumber + FIRST_SECTOR;
    }
}
