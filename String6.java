import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//todo This program finds the longest word in a sentence
public class String6 {

    public static void main(String[] args)throws IOException {


        InputStreamReader ir =new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(ir);

        System.out.println("Please enter the sentence with a full stop");
        String sen=br.readLine();

        String word="";int max=0;String largest="";int largest_length=0;
        //Cycling through the sentence
        for (int i=0;i<sen.length();++i)
        {
            char ch=sen.charAt(i);
            if(ch!=' '&& ch!='.')
            {
              word=word+ch;
            }
            else
            {
                int len=word.length();
                if (len>max)
                {
                    max=len;
                    largest=word;
                    largest_length=len;
                }
                word="";

            }
        }

        System.out.println("The largest word of the sentence is "+ largest+"\t"+" with a length of "+largest_length);
    }

}
