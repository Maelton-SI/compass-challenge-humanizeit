package maelton.compass.humanizeit.ui.lot;

import maelton.compass.humanizeit.controller.LotController;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class LotEditingUI {
    public static void run() {
        while (true) {
            showGUI();
            long lotID = UIUtil.getChoice();
            if (lotID <= 0)
                LotManagerUI.run();

            String selectedLot = LotController.getOpenLotById(lotID);
            if(selectedLot != null) {
                //TODO: NextUI.run() or NextGUI()
                System.out.println(selectedLot);
                ConsoleUtil.getInput();
            }
            else {
                System.out.println("No lot selected");
                ConsoleUtil.getInput();
            }
        }
    }

    public static void showGUI() {
        ConsoleUtil.clear();
        String openLots = LotController.getOpenLots();
        if (openLots != null) {
            System.out.println(openLots);
            System.out.println("===========================");
            System.out.print("SELECT LOT > ");
        } else {
            System.out.println("No lots found!");
        }
    }
}
