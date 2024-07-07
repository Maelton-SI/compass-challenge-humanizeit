package maelton.compass.humanizeit.ui.lot;

import maelton.compass.humanizeit.service.LotService;
import maelton.compass.humanizeit.util.ConsoleUtil;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class LotCategorizationUI {
    private static final List<Integer> VALID_ACTIONS = Arrays.asList(1, 2, 3, 4);

    public static void run() {
        while(true) {
            showGUI();
            switch (getInput()) {
                case 1:
                    LotService.addClothingLot();
                    break;
                case 2:
                    LotService.addPersonalHygieneLot();
                    break;
                case 3:
                    LotService.addFoodLot();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    private static int getInput() {
        int input = 0;
        try {
            System.out.print("> ");
            input = ConsoleUtil.getScanner().nextInt();
            if(!VALID_ACTIONS.contains(input))
                throw new IllegalArgumentException("Choose a valid number option");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
        return input;
    }

    private static void showGUI() {
        ConsoleUtil.clear();
        System.out.println("||=======================================||");
        System.out.println("||                                       ||");
        System.out.println("|| CHOOSE AN ITEMS CATEGORY FOR THIS LOT ||");
        System.out.println("||                                       ||");
        System.out.println("|| 1 - CLOTHING                          ||");
        System.out.println("|| 2 - PERSONAL HYGIENE                  ||");
        System.out.println("|| 3 - FOOD                              ||");
        System.out.println("|| 4 - BACK                              ||");;
        System.out.println("||                                       ||");
        System.out.println("||=======================================||");
    }
}
