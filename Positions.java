import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Positions {public static void main(String[] args)throws IOException {
    int s = 0, r;
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ir);
    System.out.println("Please Input the number");
    int num = Integer.parseInt(br.readLine());
    String num1 = Integer.toString(num);
    int length = num1.length()+1;


    int len=Integer.toString(num).length();
    for (int i=num;i!=0;i=i/10)
    {
        r=i%10;
        --length;

        System.out.println("Position of "+r+" is " + length);
    }


}
}