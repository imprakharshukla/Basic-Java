import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TODO This program change the Odd Positions ---> UpperCase and Even Postions --> LowerCase
public class String3 {

    public static void main(String[] args)throws IOException {


            InputStreamReader ir =new InputStreamReader(System.in);
            BufferedReader br= new BufferedReader(ir);

            System.out.println("Please enter the sentence");
            String sen=br.readLine();

            //Going through the sentence
        String word="";
        for (int i=0;i<sen.length();++i)
        {
            char ch=sen.charAt(i);

            if (i%2==0 && ch!=' ')
            {
                ch=Character.toLowerCase(ch);
            }
            else
            {
                if(ch!=' ')
                ch=Character.toUpperCase(ch);
            }

            word=word+ch;

        }

        System.out.println("The modified sentence is "+ word);

        }
    }


