package maelton.compass.humanizeit.ui.lot;

import maelton.compass.humanizeit.ui.MainUI;
import maelton.compass.humanizeit.util.ConsoleUtil;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class LotManagerUI {
    private static final List<Integer> VALID_ACTIONS = Arrays.asList(1, 2, 3, 4, 5);

    public static void run() {
        while (true) {
            showGUI();
            switch (getInput()) {
                case 1:
                    LotCategorizationUI.run();
                    break;
                case 2:
                    // show existing lots
                    break;
                case 3:
                    // edit lot
                    break;
                case 4:
                    // delete lot
                    break;
                case 5:
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
        System.out.println("||======== HumanizeIt ========||");
        System.out.println("||                            ||");
        System.out.println("|| 1 - CREATE DONATION LOT    ||");
        System.out.println("|| 2 - SHOW EXISTING LOTS     ||");
        System.out.println("|| 3 - EDIT DONATION LOT      ||");
        System.out.println("|| 4 - DELETE DONATION LOT    ||");
        System.out.println("|| 5 - BACK                   ||");
        System.out.println("||                            ||");
        System.out.println("||============================||");
    }
}
