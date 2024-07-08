package maelton.compass.humanizeit.ui.lot;

import maelton.compass.humanizeit.controller.LotController;
import maelton.compass.humanizeit.service.LotService;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class LotManagerUI {
    public static void run() {
        while (true) {
            showGUI();
            switch ((int) UIUtil.getChoice()) {
                case 1:
                    LotAdditionUI.run();
                    break;
                case 2:
                    showOpenLots();
                    break;
                case 3:
                    LotEditingUI.run();
                    break;
                case 4:
                    // delete lot
                    break;
                case 5:
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
        System.out.println("|| 1 - CREATE DONATION LOT    ||");
        System.out.println("|| 2 - SHOW OPEN LOTS         ||");
        System.out.println("|| 3 - EDIT DONATION LOT      ||");
        System.out.println("|| 4 - DELETE DONATION LOT    ||");
        System.out.println("|| 5 - BACK                   ||");
        System.out.println("||                            ||");
        System.out.println("||============================||");
        System.out.print("> ");
    }

    private static void showOpenLots() {
        ConsoleUtil.clear();
        System.out.println(LotController.getOpenLots());
        ConsoleUtil.getInput();
    }
}
