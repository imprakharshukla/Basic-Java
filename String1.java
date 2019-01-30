import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//TODO This Program is for shifting the vowels and consonants
public class String1 {
    String str;

    String1 (String b){
        str=b;
    }

    void shift()
    {
        //Running the line to seperate the letters
        String vow="",con="";
        //String str2=str.toUpperCase();
        for(int i=0;i<str.length();++i) {
            char ch = str.charAt(i);

            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vow = vow + ch;
            } else
                con = con + ch;
        }

        str=(vow+con);
    }

    void display(){

        System.out.println("The new sentence with the vowels in the right side and the consonants on the left is "+ str);

    }

    public static void main(String[] args)throws IOException {

        InputStreamReader ir =new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(ir);

        System.out.println("Please enter the word");
        String lol=br.readLine();

        String1 obj=new String1(lol);
        obj. shift();
        obj. display();

    }

}
