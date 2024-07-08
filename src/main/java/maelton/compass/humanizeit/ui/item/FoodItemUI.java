package maelton.compass.humanizeit.ui.item;

import maelton.compass.humanizeit.ui.lot.LotEditingUI;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class FoodItemUI {
    public static void run() {
        while(true) {
            showGUI();
            switch((int) UIUtil.getChoice()) {
                case 1:
                    System.out.println("RICE");
                    break;
                case 2:
                    System.out.println("BEANS");
                    break;
                case 3:
                    System.out.println("MILK");
                    break;
                case 4:
//                    LotEditingUI.run();
                    return;
                default:
                    UIUtil.invalidChoice();
            }
        }
    }
    public static void showGUI() {
        ConsoleUtil.clear();
        System.out.println("||=======================================||");
        System.out.println("||                                       ||");
        System.out.println("||        ADD AN ITEM TO THIS LOT        ||");
        System.out.println("||                                       ||");
        System.out.println("|| 1 - RICE                              ||");
        System.out.println("|| 2 - BEANS                             ||");
        System.out.println("|| 3 - MILK                              ||");
        System.out.println("|| 4 - EXIT                              ||");;
        System.out.println("||                                       ||");
        System.out.println("||=======================================||");
        System.out.print("> ");

    }
}
