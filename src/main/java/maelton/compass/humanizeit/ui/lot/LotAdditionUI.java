package maelton.compass.humanizeit.ui.lot;

import maelton.compass.humanizeit.enums.DonationCenter;
import maelton.compass.humanizeit.service.LotService;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class LotAdditionUI {
    public static void run() {
        while(true) {
            showGUI();
            switch ((int) UIUtil.getChoice()) {
                case 1:
                    LotService.addClothingLot(DonationCenter.HUMANIZEIT);
                    break;
                case 2:
                    LotService.addPersonalHygieneLot(DonationCenter.HUMANIZEIT);
                    break;
                case 3:
                    LotService.addFoodLot(DonationCenter.HUMANIZEIT);
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
        System.out.println("|| 2 - PERSONAL HYGIENE                  ||");
        System.out.println("|| 3 - FOOD                              ||");
        System.out.println("|| 4 - BACK                              ||");;
        System.out.println("||                                       ||");
        System.out.println("||=======================================||");
        System.out.print("> ");
    }
}
