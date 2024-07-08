package maelton.compass.humanizeit.ui.item.delete;

import maelton.compass.humanizeit.util.ConsoleUtil;

public class ItemAdditionUI {

    public static void run() {
        showGUI();
        getInput();
    }

    private static int getInput() {
        int input = 0;
        try {
            System.out.print("> ");
            input = ConsoleUtil.getScanner().nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

    private static void showGUI() {
        System.out.println("||=====================================||");
        System.out.println("||                                     ||");
        System.out.println("|| TYPE QUANTITY OF ITEMS TO BE ADDED  ||");
        System.out.println("||                                     ||");
        System.out.println("||=====================================||");
    }
}
