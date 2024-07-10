package maelton.compass.humanizeit.ui.lot;

import maelton.compass.humanizeit.controller.LotController;
import maelton.compass.humanizeit.ui.item.add.ClothingItemAdditionUI;
import maelton.compass.humanizeit.ui.item.add.FoodItemAdditionUI;
import maelton.compass.humanizeit.ui.item.add.PersonalHygieneItemAdditionUI;
import maelton.compass.humanizeit.ui.item.subtract.ClothingItemSubtractionUI;
import maelton.compass.humanizeit.ui.item.subtract.FoodItemSubtractionUI;
import maelton.compass.humanizeit.ui.item.subtract.PersonalHygieneItemSubtractionUI;
import maelton.compass.humanizeit.util.ConsoleUtil;
import maelton.compass.humanizeit.util.UIUtil;

import java.util.Optional;

public class LotEditingUI {
    public static void run() {
        while (true) {
            Optional<String> openLots = Optional.ofNullable(LotController.getOpenLots());
            if (openLots.isPresent()) {
                showGUI(openLots);
                long lotID = UIUtil.getChoice();
                if (lotID <= 0)
//                    LotManagerUI.run();
                    break;

                Optional<String> selectedLot = Optional.ofNullable(LotController.getOpenLotById(lotID));
                if (selectedLot.isPresent()) {
                    boolean editingSelectedLot = true;
                    while(editingSelectedLot) {
                        selectedLotGUI(lotID);
                        System.out.print("> ");
                        switch ((int) UIUtil.getChoice()) {
                            case 1:
                                getAdditionItemUI(LotController.getLotItemCategory(lotID));
                                break;
                            case 2:
                                getSubtractionItemUI(LotController.getLotItemCategory(lotID));
                                break;
                            case 3:
                                editingSelectedLot = false;
                                break;
                            default:
                                UIUtil.invalidChoice();
                        }
                    }
                } else {
                    System.out.println("No lot selected");
                    ConsoleUtil.getInput();
                }
            } else {
                ConsoleUtil.clear();
                System.out.println("No open lot found!");
                ConsoleUtil.getInput();
                break;
            }
        }
    }

    private static void showGUI(Optional<String> openLots) {
        ConsoleUtil.clear();
        if (openLots.isPresent()) {
            System.out.println(openLots.get());
            System.out.println("===========================");
            System.out.print("SELECT LOT > ");
        }
    }

    private static void selectedLotGUI(long lotId) {
        ConsoleUtil.clear();
        String selectedLot = LotController.getOpenLotById(lotId);
        if (selectedLot != null) {
            System.out.println(selectedLot);
            System.out.println("ITEMS: []");
            System.out.println();
            System.out.println("1 - ADD ITEM");
            System.out.println("2 - REMOVE ITEM");
            System.out.println("3 - BACK");
        } else {
            System.out.println("No lot found!");
        }
    }

    public static void getAdditionItemUI(String lotCategory) {
        switch (lotCategory) {
            case "FoodItem":
                FoodItemAdditionUI.run();
                break;
            case "ClothingItem":
                ClothingItemAdditionUI.run();
                break;
            case "PersonalHygieneItem":
                PersonalHygieneItemAdditionUI.run();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lotCategory);
        }
    }

    public static void getSubtractionItemUI(String lotCategory) {
        switch (lotCategory) {
            case "FoodItem":
                FoodItemSubtractionUI.run();
                break;
            case "ClothingItem":
                ClothingItemSubtractionUI.run();
                break;
            case "PersonalHygieneItem":
                PersonalHygieneItemSubtractionUI.run();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lotCategory);
        }
    }
}