import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//todo This is a program to interchange the first and the last characters of every word in a sentence.
public class String7 {

    public static void main(String[] args)throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Please enter the sentence with a full stop");
        String sen = br.readLine();

        String word = "";String sen2="";
        //Cycling through the sentence
        for (int i = 0; i < sen.length(); ++i) {
            char ch = sen.charAt(i);
            if (ch != ' ' && ch != '.') {
                word = word + ch;
            } else {
                if (word.length()>1) {
                    sen2 = sen2 + interChange(word)+" ";
                }
                word="";
            }

        }

        System.out.println(sen2);
    }

    static String interChange(String wordInterchange)
    {
        char first= wordInterchange.charAt(0);
        char last= wordInterchange.charAt(wordInterchange.length()-1);
        String rest=wordInterchange.substring(1,wordInterchange.length()-1);
        String word2=last+rest+first;
        return word2;
    }

}
