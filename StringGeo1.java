//Todo this program print a given string into a pyramid.

public class StringGeo1 {

    public static void main(String[] args) {

        //Let the string be Coding
        String word = "Coding";
        int length = word.length();

        for (int i = 0; i < word.length(); ++i) {

            for (int space = 0; space < length - i; space++) {
                System.out.print(" ");

            }

            for (int j = 0; j <= i; ++j) {
                System.out.print(word.charAt(j)+" ");
            }
            System.out.println();
        }

    }

}
