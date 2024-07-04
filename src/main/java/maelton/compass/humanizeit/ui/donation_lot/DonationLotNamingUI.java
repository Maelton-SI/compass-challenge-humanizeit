package maelton.compass.humanizeit.ui.donation_lot;

import maelton.compass.humanizeit.util.ConsoleUtil;

public class DonationLotNamingUI {
    public static void run() {
        showGUI();
        getInput();
    }

    private static String getInput() {
        String input = "";
        try {
            System.out.print("> ");
            input = ConsoleUtil.getScanner().nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

    private static void showGUI() {
        System.out.println("||=====================================||");
        System.out.println("||                                     ||");
        System.out.println("|| TYPE A NAME FOR THIS LOT (OPTIONAL) ||");
        System.out.println("||                                     ||");
        System.out.println("||=====================================||");
    }
}
