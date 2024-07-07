package maelton.compass.humanizeit.util;

import maelton.compass.humanizeit.entity.AppEntity;

public class UIUtil {
    public static void entitySaved(AppEntity entity) {
        try {
            ConsoleUtil.clear();
            System.out.println(entity);
            System.out.println("SAVED SUCCESSFULLY!");
            Thread.sleep(2000);
        } catch (Exception e) {
            ConsoleUtil.clear();
        }
    }
}
