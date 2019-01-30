import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Todo First letter UpperCase
public class String4 {
    public static void main(String[] args)throws IOException {


        InputStreamReader ir =new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(ir);

        System.out.println("Please enter the sentence with a full stop at the end");
        String sen=br.readLine();

        //Going through the sentence
        String word="";char first; String bw="";String sen2="";
        for (int i=0;i<sen.length();++i)
        {
            char ch=sen.charAt(i);
            if(ch!=' ' && ch!='.')
            {
                word=word+ch;
                //System.out.println(word);
            }
            else {
                String cappedWord=changeTheCase(word);
                sen2=sen2+cappedWord+" ";
                word="";
            }
        }



        System.out.println("The modified sentence is "+ sen2);
    }

    static String changeTheCase(String wordToChange)
    {
        char first=Character.toUpperCase(wordToChange.charAt(0));
        String rest=wordToChange.substring(1,wordToChange.length());
        String newWord=first+rest;
        return newWord;
    }
}
