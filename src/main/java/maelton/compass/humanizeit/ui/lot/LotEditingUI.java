package maelton.compass.humanizeit.ui.lot;

import maelton.compass.humanizeit.controller.LotController;
import maelton.compass.humanizeit.model.dto.LotDTO;
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
                long lotId = UIUtil.getChoice();
                if (lotId <= 0)
//                    LotManagerUI.run();
                    break;

                LotDTO selectedLotDTO = LotController.getOpenLotById(lotId);
                if (selectedLotDTO != null) {
                    boolean editingSelectedLot = true;
                    while(editingSelectedLot) {
                        selectedLotGUI(selectedLotDTO);
                        System.out.print("> ");
                        switch ((int) UIUtil.getChoice()) {
                            case 1:
                                getAdditionItemUI(selectedLotDTO);
                                break;
                            case 2:
                                getSubtractionItemUI(selectedLotDTO);
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

    private static void selectedLotGUI(LotDTO lotDTO) {
        ConsoleUtil.clear();
        if (lotDTO != null) {
            System.out.println(lotDTO);
            System.out.println("ITEMS: []");
            System.out.println();
            System.out.println("1 - ADD ITEM");
            System.out.println("2 - REMOVE ITEM");
            System.out.println("3 - BACK");
        } else {
            System.out.println("No lot found!");
        }
    }

    public static void getAdditionItemUI(LotDTO lotDTO) {
        switch (lotDTO.category()) {
            case "ClothingItem":
                ClothingItemAdditionUI.run(lotDTO.id());
                break;
            case "FoodItem":
                FoodItemAdditionUI.run(lotDTO.id());
                break;
            case "PersonalHygieneItem":
                PersonalHygieneItemAdditionUI.run(lotDTO.id());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lotDTO.category());
        }
    }

    public static void getSubtractionItemUI(LotDTO lotDTO) {
        switch (lotDTO.category()) {
            case "ClothingItem":
                ClothingItemSubtractionUI.run(lotDTO.id());
                break;
            case "FoodItem":
                FoodItemSubtractionUI.run(lotDTO.id());
                break;
            case "PersonalHygieneItem":
                PersonalHygieneItemSubtractionUI.run(lotDTO.id());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + lotDTO.category());
        }
    }
}