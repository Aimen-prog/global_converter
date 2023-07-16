public class InputTransformer {

    public static int[] toAscii(String input) {
        int[] asciiValues = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            asciiValues[i] = (int) input.toCharArray()[i];
        }

        return asciiValues;
    }




}
