package maelton.compass.humanizeit.ui.item.add;

import maelton.compass.humanizeit.controller.ItemController;
import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.ui.lot_has_item.SettingItemQuantityUI;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class FoodItemAdditionUI {
    public static void run(long lotId) {
        while(true) {
            showGUI();
            switch((int) UIUtil.getChoice()) {
                case 1:
                    SettingItemQuantityUI.run(ItemController.addFoodItem(FoodType.RICE), lotId);
                    break;
                case 2:
                    SettingItemQuantityUI.run(ItemController.addFoodItem(FoodType.BEANS), lotId);
                    break;
                case 3:
                    SettingItemQuantityUI.run(ItemController.addFoodItem(FoodType.MILK), lotId);
                    break;
                case 4:
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
        System.out.println("|| 1 - RICE                              ||");
        System.out.println("|| 2 - BEANS                             ||");
        System.out.println("|| 3 - MILK                              ||");
        System.out.println("|| 4 - EXIT                              ||");;
        System.out.println("||                                       ||");
        System.out.println("||=======================================||");
        System.out.print("> ");
    }
}
