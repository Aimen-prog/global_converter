import java.util.Arrays;

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

    public static String toBinary(String input){
        String translatedString = "";
        int[] asciiValues = toAscii(input);

        for (int value : asciiValues) {
            String binaryString = "";
            while (value > 0) {
                int rest = value % 2;
                binaryString = rest + binaryString;
                value = value / 2;
            }
            translatedString += binaryString + " ";
        }
        return translatedString.trim();
    }



    public static String toHexadecimal(String input){

        String hexChain = "0123456789ABCDEF";
        String translatedString = "";
        int[] asciiValues = toAscii(input);

        for (int value : asciiValues) {
            String hexString = "";
            while (value > 0) {
                int rest = value % 16;
                hexString = hexChain.charAt(rest) + hexString;
                value = value / 16;
            }

            translatedString += hexString + " ";
        }
        return translatedString.trim();

    }


    public static String toText(String input) {
        String[] parts = input.split("\\s+") ;  // split the input by whitespace
        String baseID = parts[0];
        String[] inputToTransform = Arrays.copyOfRange(parts, 1, parts.length);
        String translatedString = "" ;

        for (String part : inputToTransform) {
            int value;
            if (baseID.equals("hex"))  {
                value = Integer.parseInt(part, 16); // parse hexadecimal value
            } else if (baseID.equals("oct"))  {
                value = Integer.parseInt(part, 8); // parse octal val
            } else if (baseID.equals("bin"))  {
                value = Integer.parseInt(part, 2); // parse binary val
            } else {
                value = Integer.parseInt(part); // parse decimal val
            }
            translatedString+= ((char) value); // Convert Ascii val to character

        }
        return translatedString.toString();
    }



    public static String translate(String input, String base) {
        switch (base) {
            case "decimal" :
                String decimalValues = Arrays.toString(toAscii(input))
                        .replace(",", "")
                        .replace("[", "")
                        .replace("]", "").trim() ;
                return decimalValues;
            case "octal":
                return toOctal(input);
            case "binary":
                return toBinary(input);
            case "hexadecimal":
                return toHexadecimal(input);
            case "text":
                return toText(input);
            default:
                throw new IllegalArgumentException("Invalid base: " + base);
        }
    }

}
