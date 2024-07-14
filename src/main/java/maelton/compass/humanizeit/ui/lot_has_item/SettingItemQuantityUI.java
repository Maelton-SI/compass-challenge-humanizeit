package maelton.compass.humanizeit.ui.lot_has_item;

import maelton.compass.humanizeit.controller.LotController;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.repository.LotRepository;
import maelton.compass.humanizeit.service.LotService;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

public class SettingItemQuantityUI {
        public static void run(Item item, long lotId) {
            while (true) {
                    showGUI(item, lotId);
                    int quantity = ConsoleUtil.getScanner().nextInt();
                    if (quantity <= 0)
                        return;
                    if(quantity >= 1001)
                        System.out.println("Invalid quantity: " + quantity);
                    LotService.addItemToLot(item, lotId, quantity);
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
