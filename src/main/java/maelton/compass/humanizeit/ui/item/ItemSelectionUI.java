package maelton.compass.humanizeit.ui.item;

import maelton.compass.humanizeit.util.ConsoleUtil;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class ItemSelectionUI {
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

    //TODO: implement GUI generation logic based on FoodType enums
    //TODO: change VALID_ACTIONS values based on FoodType enums quantity
    private static void showGUI() {
        System.out.println("||=======================================||");
        System.out.println("||                                       ||");
        System.out.println("||        ADD AN ITEM TO THIS LOT        ||");
        System.out.println("||                                       ||");
        System.out.println("|| 1 - RICE                              ||");
        System.out.println("|| 2 - BEANS                             ||");
        System.out.println("|| 3 - MILK                              ||");
        System.out.println("|| 4 - EXIT                              ||");;
        System.out.println("||                                       ||");
        System.out.println("||=======================================||");
    }
}
