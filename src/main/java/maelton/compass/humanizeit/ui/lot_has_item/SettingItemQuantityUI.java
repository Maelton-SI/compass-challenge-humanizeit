package maelton.compass.humanizeit.ui.lot_has_item;

import maelton.compass.humanizeit.controller.LotController;
import maelton.compass.humanizeit.model.entity.item.Item;
import maelton.compass.humanizeit.repository.LotRepository;
import maelton.compass.humanizeit.service.LotService;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

import java.util.InputMismatchException;

public class SettingItemQuantityUI {
    public static void run(Item item, long lotId) {
        while (true) {
            showGUI(item, lotId);
            try {
                int quantity = ConsoleUtil.getScanner().nextInt();
                if (quantity <= 0)
                    return;
                if (quantity >= 1001)
                    throw new IllegalArgumentException();

                LotService.addItemToLot(item, lotId, quantity);
                UIUtil.printMessage("Item added to lot successfully!", 2000);
                return;
            } catch(IllegalArgumentException e) {
                UIUtil.printMessage("Maximum quantity of items exceeded.", 2000);
            } catch(InputMismatchException e) {
                UIUtil.printMessage("Type a valid quantity: minimum 1, maximum 1000.", 2000);
                ConsoleUtil.getScanner().nextLine();
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
