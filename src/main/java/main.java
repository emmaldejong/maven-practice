import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String input = scan.nextLine();

        System.out.println("You Entered: \"" + StringUtils.defaultString(input) + "\"");
        if(!StringUtils.isNumeric(input)) {
            System.out.println("\""+ input + "\" is not a number.");
        }
        System.out.println("Flipped case: \"" + StringUtils.swapCase(input) + "\"");
        System.out.println("Reversed string: \"" + StringUtils.reverse(input) + "\"");
    }
}
