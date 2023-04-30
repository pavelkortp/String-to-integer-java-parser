public class NumberFormatter {
    public static int parseInt(String number) {

        if(number.isEmpty())
            throw new IllegalArgumentException("row should not be empty");

        //convert string number to char massive chars
        char[] chars = number.toCharArray();
        //create mass int which will be contained piece of final number
        int[] pieces = new int[number.length()];
        //return value
        int finalResult = 0;
        //difference in length
        int delta = 0;
        if (number.contains("+")||number.contains("-")){
            delta = 1;
        }

        //find number by symbol and put in into inm mas pieces
        for (int i = delta; i < number.length(); i++) {
            for (int j = 0; j < 10; j++) {
                if (chars[i] == '0') {
                    pieces[i] = 0;
                } else if (chars[i] == '1') {
                    pieces[i] = 1;
                } else if (chars[i] == '2') {
                    pieces[i] = 2;
                } else if (chars[i] == '3') {
                    pieces[i] = 3;
                } else if (chars[i] == '4') {
                    pieces[i] = 4;
                } else if (chars[i] == '5') {
                    pieces[i] = 5;
                } else if (chars[i] == '6') {
                    pieces[i] = 6;
                } else if (chars[i] == '7') {
                    pieces[i] = 7;
                } else if (chars[i] == '8') {
                    pieces[i] = 8;
                } else {
                    pieces[i] = 9;
                }
            }
        }

        //construct from pieces to final result number
        for(int i = 0; i<pieces.length; i++){
            finalResult = (int) (finalResult+pieces[i]*Math.pow(10, pieces.length-1-i));
        }

        // last check if number have exactly minus
        if(number.contains("-")){
            finalResult = -1 * finalResult;
        }

        return finalResult;
    }
}
