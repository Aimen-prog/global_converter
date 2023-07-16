public class InputTranslator {

    public static int[] toAscii(String input) {
        int[] asciiValues = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            asciiValues[i] = (int) input.toCharArray()[i];
        }

        return asciiValues;
    }


    public static String toOctal(String input){

        String translatedString = "";
        int[] asciiValues = toAscii(input);

        for (int value : asciiValues) {
            String octalString = "";
            while (value > 0) {
                int rest = value % 8;
                octalString = rest + octalString;
                value = value / 8;
            }
            translatedString += octalString + " ";
        }
        return translatedString.trim();

    }


    public static String toHexadecimal(String input){
        String translatedString = "";
        int[] asciiValues = toAscii(input);
        for (int value : asciiValues) {
            System.out.println("....");
        }
        return translatedString.trim();

    }

    public static String toBinary(String input){
        String translatedString = "";
        int[] asciiValues = toAscii(input);
        for (int value : asciiValues) {
            System.out.println("....");
        }
        return translatedString.trim();

    }

    public static String toText(String input){
        String translatedString = "";
        int[] binaryValues = toAscii(input);
        for (int value : binaryValues) {
            System.out.println("....");
        }
        return translatedString.trim();

    }


    public static String translate(String input, String base) {
        switch (base) {
            case "octal":
                return toOctal(input);
            case "hexadecimal":
                return toHexadecimal(input);
            case "binary":
                return toBinary(input);
            case "text":
                return toText(input);
            default:
                throw new IllegalArgumentException("Invalid base: " + base);
        }
    }

}
