import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // get user input, create and initialize scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String input = scan.nextLine();

        //solve the exercise problems to get the expected output
        System.out.println("You Entered: \"" + StringUtils.defaultString(input) + "\"");
        if (!StringUtils.isNumeric(input)) {
            System.out.println("\"" + input + "\" is not a number.");
        }
        System.out.println("Flipped case: \"" + StringUtils.swapCase(input) + "\"");
        System.out.println("Reversed string: \"" + StringUtils.reverse(input) + "\"");

        //bonus outputs
        System.out.println("Contains a vowel: " + containsVowel(input));
        System.out.println("Contains spaces: " + containsNoSpaces(input));
        System.out.println(removeVowels(input));
    }

    //create a method that takes in a string and outputs a boolean if the string contains a vowel
    private static boolean containsVowel(String input) {
        return StringUtils.containsAny(input, "aeiou");
    }

    //    create a method that takes in a string and outputs a boolean if the string contains no spaces
    private static boolean containsNoSpaces(String input) {
        return StringUtils.containsWhitespace(input);
    }

    private static String removeVowels(String input) {
        return StringUtils.remove(input, "aeiou");
    }
}
//    create a method that takes in a string and outputs a string with all vowels removed if it has any
//    create a method that takes in a string and outputs that same string and capitalizes it, if the string starts with a consonant

