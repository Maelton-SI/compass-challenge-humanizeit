package maelton.compass.humanizeit.util;

import lombok.AccessLevel;
import lombok.Getter;

import java.util.Scanner;

public class ConsoleUtil {
    @Getter(AccessLevel.PUBLIC)
    private static final Scanner scanner = new Scanner(System.in);
    private static final String os =  System.getProperty("os.name");

    public static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void getInput() {
        String input = scanner.nextLine();
        scanner.nextLine();
    }
}
