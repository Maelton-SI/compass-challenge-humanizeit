package maelton.compass.humanizeit.ui.lot;

import maelton.compass.humanizeit.controller.LotController;
import maelton.compass.humanizeit.model.enums.DonationCenter;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class LotAdditionUI {
    public static void run() {
        while(true) {
            showGUI();
            switch ((int) UIUtil.getChoice()) {
                case 1:
                    ConsoleUtil.clear();
                    System.out.println(LotController.addClothingLot(DonationCenter.HUMANIZEIT));
                    ConsoleUtil.getInput();
                    break;
                case 2:
                    ConsoleUtil.clear();
                    System.out.println(LotController.addFoodLot(DonationCenter.HUMANIZEIT));
                    ConsoleUtil.getInput();
                    break;
                case 3:
                    ConsoleUtil.clear();
                    System.out.println(LotController.addPersonalHygieneLot(DonationCenter.HUMANIZEIT));
                    ConsoleUtil.getInput();
                    break;
                case 4:
                    return;
                default:
                    UIUtil.invalidChoice();
            }
        }
    }

    private static void showGUI() {
        ConsoleUtil.clear();
        System.out.println("||=======================================||");
        System.out.println("||                                       ||");
        System.out.println("|| CHOOSE AN ITEMS CATEGORY FOR THIS LOT ||");
        System.out.println("||                                       ||");
        System.out.println("|| 1 - CLOTHING                          ||");
        System.out.println("|| 2 - FOOD                              ||");
        System.out.println("|| 3 - PERSONAL HYGIENE                  ||");
        System.out.println("|| 4 - BACK                              ||");;
        System.out.println("||                                       ||");
        System.out.println("||=======================================||");
        System.out.print("> ");
    }
}
