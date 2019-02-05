import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalQ2 {

    public static void main(String[] args)throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(ir);
        String senss[];
        String sens="";

        System.out.println("Enter the string with multiple sentences seperated by . or ! or ?");
        String sen=br.readLine();
        int word=0;


        for(int k=0;k<sen.length();++k) {
            char ch = sen.charAt(k);
            if (ch == '.' || ch == '!' || ch == '?') {
                word++;
            }
        }


        senss=new String [word];

        // sen contains the string with multiple sentences
        int n=0;
        for(int i=0;i<sen.length();++i)
        {
            char ch=sen.charAt(i);

            if (ch!='.' && ch!='!' && ch!='?')
            {
                sens=sens+ch;

            }

            else if (ch==' ')
            {
                sens=sens+" ";
            }

            else
            {
                //In this else statement we have the one sentence ar a time


                senss[n]=sens.trim();
                ++n;
                sens="";
            }

        }

       // Here we have the sentences seperated on diff positions of the String array senss[]

        sort(senss,senss.length);

        for (int i=0;i<senss.length;++i)
        {
            System.out.print(senss[i]+" ");
        }

    }

    static void sort(String []s, int n)
    {
        for (int i=1 ;i<n; i++)
        {
            String temp = s[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length())
            {
                s[j+1] = s[j];
                j--;
            }
            s[j+1] = temp;
        }
    }


}
