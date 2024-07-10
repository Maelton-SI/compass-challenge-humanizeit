package maelton.compass.humanizeit.ui.item.add;

import maelton.compass.humanizeit.controller.ItemController;
import maelton.compass.humanizeit.model.enums.ClothingType;
import maelton.compass.humanizeit.model.enums.FoodType;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class FoodItemAdditionUI {
    public static void run() {
        while(true) {
            showGUI();
            switch((int) UIUtil.getChoice()) {
                case 1:
                    ConsoleUtil.clear();
                    System.out.println(ItemController.addFoodItem(FoodType.RICE));
                    ConsoleUtil.getInput();
                    break;
                case 2:
                    ConsoleUtil.clear();
                    System.out.println(ItemController.addFoodItem(FoodType.BEANS));
                    ConsoleUtil.getInput();
                    break;
                case 3:
                    ConsoleUtil.clear();
                    System.out.println(ItemController.addFoodItem(FoodType.MILK));
                    ConsoleUtil.getInput();
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
