import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class NumberFormatter {
    public static int parseInt(String number) {

        if (number.isEmpty())
            throw new IllegalArgumentException("row should not be empty");

        //convert string number to char massive chars
        char[] chars = number.toCharArray();
        //create mass int which will be contained piece of final number
        int[] pieces = new int[number.length()];
        //return value
        int finalResult = 0;
        //difference in length
        int delta = 0;
        if (number.contains("+") || number.contains("-")) {
            delta = 1;
        }
        //construct from pieces to final result number
        for (int i = delta; i < pieces.length; i++) {
            finalResult = (int) (finalResult +  (chars[i] -48) * Math.pow(10, pieces.length - 1 - i));
        }
        // last check if number have exactly minus
        if (number.contains("-")) {
            finalResult = -1 * finalResult;
        }
        return finalResult;
    }

    public static String valueOf(int number) {
        //return value
        String finalResult = "";
        //length of number
        int length = 0;
        //check if number smaller then 0
        if (number < 0) {
            finalResult = "-";
            number = abs(number);
            length = 1;
        }
        //find length
        if (abs(number) < 10) {
            length = 1;
        } else if (abs(number) < 100) {
            length = 2;
        } else if (abs(number) < 1000) {
            length = 3;
        } else if (abs(number) < 10000) {
            length = 4;
        } else if (abs(number) < 100000) {
            length = 5;
        } else if (abs(number) < 1000000) {
            length = 6;
        } else if (abs(number) < 10000000) {
            length = 7;
        } else if (abs(number) < 100000000) {
            length = 8;
        } else if (abs(number) < 1000000000) {
            length = 9;
        } else {
            length = 10;
        }

        //find piece of number
        StringBuilder finalResultBuilder = new StringBuilder(finalResult);
        for (int i = 0; i < length; i++) {

            int divider = (int) (number / Math.pow(10, length - i - 1));

            number = (int) (number - divider * pow(10, length - i - 1));

            if (divider == 1) {
                finalResultBuilder.append("1");

            } else if (divider == 2) {
                finalResultBuilder.append("2");

            } else if (divider == 3) {
                finalResultBuilder.append("3");

            } else if (divider == 4) {
                finalResultBuilder.append("4");

            } else if (divider == 5) {
                finalResultBuilder.append("5");

            } else if (divider == 6) {
                finalResultBuilder.append("6");

            } else if (divider == 7) {
                finalResultBuilder.append("7");

            } else if (divider == 8) {
                finalResultBuilder.append("8");

            } else if (divider == 9) {
                finalResultBuilder.append("9");

            } else if (divider == 0) {
                finalResultBuilder.append("0");
            }
        }
        finalResult = finalResultBuilder.toString();
        return finalResult;
    }
}
