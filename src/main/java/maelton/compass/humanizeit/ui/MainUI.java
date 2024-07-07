package maelton.compass.humanizeit.ui;

import maelton.compass.humanizeit.ui.lot.LotManagerUI;
import maelton.compass.humanizeit.util.ConsoleUtil;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class MainUI {
    private static final List<Integer> VALID_ACTIONS = Arrays.asList(1, 2, 3);

    public static void run() {
        while (true) {
            showGUI();
            switch (getInput()) {
                case 1:
                    // donate
                    break;
                case 2:
                    LotManagerUI.run();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    //TODO: finish method implementation
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
        System.out.println("|| 1 - DONATE                 ||");
        System.out.println("|| 2 - DONATION LOTS MANAGER  ||");
        System.out.println("|| 3 - EXIT                   ||");
        System.out.println("||                            ||");
        System.out.println("||============================||");
    }
}
