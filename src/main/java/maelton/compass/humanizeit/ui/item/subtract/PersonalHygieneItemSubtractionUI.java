package maelton.compass.humanizeit.ui.item.subtract;

import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class PersonalHygieneItemSubtractionUI {
    public static void run() {
        while(true) {
            showGUI();
            switch((int) UIUtil.getChoice()) {
                case 1:
                    System.out.println("SOAP");
                    break;
                case 2:
                    System.out.println("TOOTHBRUSH");
                    break;
                case 3:
                    System.out.println("TOOTHPASTE");
                    break;
                case 4:
                    System.out.println("MENSTRUAL PAD");
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
        System.out.println("||========================================||");
        System.out.println("||                                        ||");
        System.out.println("||      SUBTRACT ITEMS FROM THIS LOT      ||");
        System.out.println("||                                        ||");
        System.out.println("|| 1 - SOAP                               ||");
        System.out.println("|| 2 - TOOTHBRUSH                         ||");
        System.out.println("|| 3 - TOOTHPASTE                         ||");
        System.out.println("|| 4 - MENSTRUAL PAD                      ||");
        System.out.println("|| 5 - EXIT                               ||");
        System.out.println("||                                        ||");
        System.out.println("||========================================||");
        System.out.print("> ");
    }
}
