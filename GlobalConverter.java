import java.util.Scanner;

public class GlobalConverter {
    public static void main(String[] args) {
        String base;
        String inputString;

        if (args.length == 0) {
            System.out.println("No input string provided.");
            return;
        } else if (args.length < 2) {
            base = "text"; // Default base value if only one argument is provided
            inputString = args[0];
        } else {
            base = args[0];
            inputString = args[1];
        }

        if (!InputValidator.isValidBase(base)) {
            System.out.println("Invalid base input. Please enter a valid base.");
            return;
        }

        if (InputValidator.isAlphanumeric(inputString)) {
            System.out.println("The result of the conversion is:");
            String translatedString = InputTranslator.translate(inputString, base);
            System.out.println(translatedString);

        } else {
            System.out.println("Invalid input. Only alphanumeric characters are allowed.");
        }
    }
}
