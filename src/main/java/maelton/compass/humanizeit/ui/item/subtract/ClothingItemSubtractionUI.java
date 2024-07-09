package maelton.compass.humanizeit.ui.item.subtract;

import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class ClothingItemSubtractionUI {
    public static void run() {
        while(true) {
            showGUI();
            switch((int) UIUtil.getChoice()) {
                case 1:
                    System.out.println("SHIRT");
                    break;
                case 2:
                    System.out.println("JACKET");
                    break;
                case 3:
//                    LotEditingUI.run();
                    return;
                default:
                    UIUtil.invalidChoice();
            }
        }
    }
    private static void showGUI() {
        ConsoleUtil.clear();
        System.out.println("||========================================||");
        System.out.println("||                                        ||");
        System.out.println("||      SUBTRACT ITEMS FROM THIS LOT      ||");
        System.out.println("||                                        ||");
        System.out.println("|| 1 - SHIRT                              ||");
        System.out.println("|| 2 - JACKET                             ||");
        System.out.println("|| 3 - EXIT                               ||");
        System.out.println("||                                        ||");
        System.out.println("||========================================||");
        System.out.print("> ");
    }
}
