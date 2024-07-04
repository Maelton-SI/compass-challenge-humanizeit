package maelton.compass.humanizeit.ui;

import maelton.compass.humanizeit.util.ConsoleUtil;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

public class MainUI {
    private static final List<Integer> VALID_ACTIONS = Arrays.asList(1, 2, 3);

    public static void run() {
        showGUI();
        getInput();
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
        System.out.println("||======== HumanizeIt ========||");
        System.out.println("||                            ||");
        System.out.println("|| 1 - DONATE                 ||");
        System.out.println("|| 2 - DONATION LOTS MANAGER  ||");
        System.out.println("|| 3 - EXIT                   ||");
        System.out.println("||                            ||");
        System.out.println("||============================||");
    }
}
