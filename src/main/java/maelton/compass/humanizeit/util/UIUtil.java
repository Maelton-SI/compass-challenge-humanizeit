package maelton.compass.humanizeit.util;

import maelton.compass.humanizeit.model.interfaces.AppEntity;

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

    public static void entitySaved(AppEntity entity) {
            ConsoleUtil.clear();
            System.out.println(entity);
            System.out.println();
            System.out.println("SAVED SUCCESSFULLY!");
    }
}
