package maelton.compass.humanizeit;

import maelton.compass.humanizeit.ui.MainUI;
import maelton.compass.humanizeit.util.JpaUtil;

public class App {
    public static void main(String[] args) {
        JpaUtil.getEmptyTransaction();
        MainUI.run();
    }
}