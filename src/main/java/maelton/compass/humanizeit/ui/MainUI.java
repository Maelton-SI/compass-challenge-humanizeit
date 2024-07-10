package maelton.compass.humanizeit.ui;

import maelton.compass.humanizeit.ui.lot.LotManagerUI;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

import java.util.InputMismatchException;

public class MainUI {
    public static void run() {
        while (true) {
            showGUI();
            switch ((int) UIUtil.getChoice()) {
                case 1:
                    // donate
                    break;
                case 2:
                    LotManagerUI.run();
                    break;
                case 3:
                    return;
                default:
                    UIUtil.invalidChoice();
            }
        }
    }

    private static void showGUI() {
        ConsoleUtil.clear();
        System.out.println("||======== HumanizeIt ========||");
        System.out.println("||                            ||");
        System.out.println("|| 1 - DONATE                 ||");
        System.out.println("|| 2 - DONATION LOTS MANAGER  ||");
        System.out.println("|| 3 - EXIT                   ||");
        System.out.println("||                            ||");
        System.out.println("||============================||");
        System.out.print("> ");
    }
}
