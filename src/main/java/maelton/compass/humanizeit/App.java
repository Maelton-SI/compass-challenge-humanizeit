package maelton.compass.humanizeit;

import maelton.compass.humanizeit.enums.DonationCenter;
import maelton.compass.humanizeit.ui.MainUI;
import maelton.compass.humanizeit.util.ConsoleUtil;

public class App {
    public static void main(String[] args) {
//        MainUI.run();
//        ConsoleUtil.clear();
        DonationCenter donationCenter = DonationCenter.HUMANIZEIT;
        System.out.println(donationCenter.getClass().getSimpleName());
    }
}