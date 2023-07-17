public class InputValidator {
    public static boolean isAlphanumeric(String input) {
        return input.matches("[a-zA-Z0-9 ]+");
    }

    public static boolean isValidBase(String base) {
        return base.equals("text") || base.equals("decimal") || base.equals("octal") || base.equals("hexadecimal") || base.equals("binary");
    }
}
