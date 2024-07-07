package maelton.compass.humanizeit.ui.item;

import maelton.compass.humanizeit.util.ConsoleUtil;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class ItemMeasurementSelectionUI {
    //TODO: since input options may vary, VALID_ACTIONS will probably be removed
    private static final List<Integer> VALID_ACTIONS = Arrays.asList(1, 2, 3, 4);

    public static void run() {
        showGUI();
        getInput();
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

    //TODO: implement GUI generation logic based on UnitOfMeasurement enums
    //TODO: change VALID_ACTIONS values based on UnitOfMeasurement enums quantity
    private static void showGUI() {
        System.out.println("||==========================================||");
        System.out.println("||                                          ||");
        System.out.println("|| CHOOSE A MEASUREMENT UNITY FOR THIS ITEM ||");
        System.out.println("||                                          ||");
        System.out.println("|| 1 - KG                                   ||");
        System.out.println("|| 2 - L                                    ||");
        System.out.println("|| 3 - UNITY                                ||");
        System.out.println("|| 4 - EXIT                                 ||");;
        System.out.println("||                                          ||");
        System.out.println("||==========================================||");
    }
}
