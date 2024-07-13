package maelton.compass.humanizeit.ui.lot_has_item;

import maelton.compass.humanizeit.controller.LotController;
import maelton.compass.humanizeit.model.interfaces.Item;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class SettingItemQuantityUI {
        public static void run(Item item, long lotId) {
            while (true) {
                    showGUI(item, lotId);
                    switch((int) UIUtil.getChoice()) {
                        case -1:
                            //
                            return;
                        default:
                            break;
                    }
            }
        }

        private static void showGUI(Item item, long lotId) {
            ConsoleUtil.clear();
            System.out.println("LOT ====>>> " + LotController.getOpenLotById(lotId));
            System.out.println("ITEMS: []");
            System.out.println("ITEM ====>> " + item);
            System.out.println();
            System.out.print("QUANTITY > ");
        }
    }
