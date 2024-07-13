package maelton.compass.humanizeit.ui.item.add;

import maelton.compass.humanizeit.controller.ItemController;
import maelton.compass.humanizeit.model.enums.PersonalHygieneType;
import maelton.compass.humanizeit.ui.lot_has_item.SettingItemQuantityUI;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class PersonalHygieneItemAdditionUI {
    public static void run(long lotId) {
        while(true) {
            showGUI();
            switch((int) UIUtil.getChoice()) {
                case 1:
                    SettingItemQuantityUI.run(ItemController.addPersonalHygieneItem(PersonalHygieneType.SOAP), lotId);
                    break;
                case 2:
                    SettingItemQuantityUI.run(ItemController.addPersonalHygieneItem(PersonalHygieneType.TOOTHBRUSH), lotId);
                    break;
                case 3:
                    SettingItemQuantityUI.run(ItemController.addPersonalHygieneItem(PersonalHygieneType.TOOTHPASTE), lotId);
                    break;
                case 4:
                    SettingItemQuantityUI.run(ItemController.addPersonalHygieneItem(PersonalHygieneType.MENSTRUAL_PAD), lotId);
                    break;
                case 5:
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
        System.out.println("|| 1 - SOAP                              ||");
        System.out.println("|| 2 - TOOTHBRUSH                        ||");
        System.out.println("|| 3 - TOOTHPASTE                        ||");
        System.out.println("|| 4 - MENSTRUAL PAD                     ||");
        System.out.println("|| 5 - EXIT                              ||");
        System.out.println("||                                       ||");
        System.out.println("||=======================================||");
        System.out.print("> ");
    }
}
