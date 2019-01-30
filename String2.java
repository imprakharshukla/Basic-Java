import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TODO This program is for toggling the cases of the word
public class String2 {
    String str,nstr;

    //Constructor

    String2(String n){
        str=n;
        nstr="";
    }

    void convert()
    {
        //This code segment is for running across the word and finding the cases
        for (int i=0;i<str.length();++i)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
               ch= Character.toLowerCase(ch);
            }
            else
            {
               ch= Character.toUpperCase(ch);
            }

            nstr=nstr+ch;

        }
    }

    void  display(){

        System.out.println("The old one is "+str+"\n"+ "The new one is "+nstr);

    }

    public static void main(String[] args)throws IOException {

        InputStreamReader ir =new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(ir);

        System.out.println("Please enter the word");
        String lol=br.readLine();

        String2 obj=new String2(lol);
        obj. convert();
        obj. display();

    }

}
