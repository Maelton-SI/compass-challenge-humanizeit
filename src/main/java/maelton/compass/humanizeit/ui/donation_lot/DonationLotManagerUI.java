package maelton.compass.humanizeit.ui.donation_lot;

import maelton.compass.humanizeit.util.ConsoleUtil;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class DonationLotManagerUI {
    private static final List<Integer> VALID_ACTIONS = Arrays.asList(1, 2, 3, 4, 5);

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

    private static void showGUI() {
        System.out.println("||======== HumanizeIt ========||");
        System.out.println("||                            ||");
        System.out.println("|| 1 - CREATE LOT             ||");
        System.out.println("|| 2 - SHOW EXISTING LOTS     ||");
        System.out.println("|| 3 - UPDATE LOT             ||");
        System.out.println("|| 4 - DELETE LOT             ||");
        System.out.println("|| 5 - EXIT                   ||");
        System.out.println("||                            ||");
        System.out.println("||============================||");
    }
}
