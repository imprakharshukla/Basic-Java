import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Magic_Number {
    public static void main(String[] args)throws IOException {
            int s=0,r;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Please Input the number");
        int num = Integer.parseInt(br.readLine());
        String num1=Integer.toString(num);
        int length=num1.length();
        int j;
        for(int i=1;i<=length;++i)
        {
            for (j=num;j!=0;j=j/10)
            {
                r=j%10;
                s=s+r;
            }
            if(s>=9)
            { System.out.println(
                    "The number is a magic number1" );
                break;
            }
                    else{
                j=s;
                s=0;
                r=0;

            }
            if (i==length){
            System.out.println("The number isnt a magic number");}}





    }
}
