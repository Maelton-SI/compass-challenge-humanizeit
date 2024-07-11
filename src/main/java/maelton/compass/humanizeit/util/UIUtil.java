package maelton.compass.humanizeit.util;

import maelton.compass.humanizeit.model.interfaces.AppEntity;

import java.util.InputMismatchException;

public class UIUtil {
    public static void invalidChoice() {
        try {
            ConsoleUtil.clear();
            System.out.println("Invalid choice. Please select a valid option.");
            Thread.sleep(2000);
        } catch (Exception e) {
            ConsoleUtil.clear();
        }
    }

    public static String entitySaved(AppEntity entity) {
        return entity.toString() + "\n" + "SAVED SUCCESSFULLY!";
    }

    public static String errorSavingEntity(AppEntity entity) {
        return entity.toString() + "\n" + "COULD NOT BE SAVED!";
    }

    public static long getChoice() {
        long input = 0L;
        try {
            input = ConsoleUtil.getScanner().nextLong();
        } catch (InputMismatchException e) {
            ConsoleUtil.getScanner().nextLine();
            return -1L;
        }
        return input;
    }
}
