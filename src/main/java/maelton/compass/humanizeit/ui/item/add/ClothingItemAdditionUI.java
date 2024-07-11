package maelton.compass.humanizeit.ui.item.add;

import maelton.compass.humanizeit.controller.ItemController;
import maelton.compass.humanizeit.model.enums.ClothingType;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class ClothingItemAdditionUI {
    public static void run() {
        while(true) {
            showGUI();
            switch((int) UIUtil.getChoice()) {
                case 1:
                    //
                    ConsoleUtil.clear();
                    System.out.println(ItemController.addClothingItem(ClothingType.SHIRT));
                    ConsoleUtil.getInput();
                    break;
                case 2:
                    ConsoleUtil.clear();
                    System.out.println(ItemController.addClothingItem(ClothingType.JACKET));
                    ConsoleUtil.getInput();
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
        System.out.println("||=======================================||");
        System.out.println("||                                       ||");
        System.out.println("||         ADD ITEMS TO THIS LOT         ||");
        System.out.println("||                                       ||");
        System.out.println("|| 1 - SHIRT                             ||");
        System.out.println("|| 2 - JACKET                            ||");
        System.out.println("|| 3 - EXIT                              ||");
        System.out.println("||                                       ||");
        System.out.println("||=======================================||");
        System.out.print("> ");
    }
}
