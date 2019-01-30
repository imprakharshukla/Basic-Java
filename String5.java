import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//todo This program finds out and count the palindrome words in a sentence
public class String5 {

    public static void main(String[] args)throws IOException {


        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Please enter the sentence ending with a full-stop");
        String sen = br.readLine();


        //Looping through the sentence here

        String word="";int c=0;
        for (int i = 0; i < sen.length(); ++i)
        {
            char ch=sen.charAt(i);
            if(ch!=' '&& ch!='.')
            {
                word=word+ch;
            }
            else
            {

                if(word.length()>1)
                if(checkForPalin(word))
                {
                    c++;
                    System.out.println(word);
                }
                word="";
            }

        }

        System.out.println("The total palindrome words are "+ c);
    }

  static  Boolean checkForPalin(String word)
    {
        String rev="";
        //revering the string
        for(int i=word.length()-1;i>=0;--i)
        {
            char ch=word.charAt(i);
            rev=rev+ch;
        }
        return word.equalsIgnoreCase(rev);
    }
}
