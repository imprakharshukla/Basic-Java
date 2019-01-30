import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostiveWholeNumber {
    public static void main(String[] args)throws IOException {
        int s = 0, r;String numRight="",numLeft="";
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Please Input the number");
        int num = Integer.parseInt(br.readLine());
        int sq=num*num;
        String num1 = Integer.toString(sq);


        int len=num1.length();  //original length
        System.out.println("len = " + len);
        int lenHalf=len/2;       //Half of the Length
        System.out.println("lenHalf = " + lenHalf);
        int lenLeft=len-lenHalf;  //Left over of the length

        //  WE NEED THE LARGER (lenLeft) on the right
        //  WE NEED THE SMALLER (LenHalf) on the left

        //RIGHT
        for (int i=lenHalf;i<len;++i)
        {
            char ch=num1.charAt(i);
            numRight=numRight+ch;
            System.out.println("ch = " + ch);
        }
        System.out.println("numLeft = " + numRight);
        //LEFT
        for (int j=0;j<lenHalf;++j)
        {
            char ch1=num1.charAt(j);
            numLeft=numLeft+ch1;
            System.out.println("ch1 = " + ch1);
        }
        System.out.println("numRight = " + numLeft);
        
        int NumRight=Integer.parseInt(numRight);
        int NumLeft=Integer.parseInt(numLeft);

        int sum=NumLeft+NumRight;
        System.out.println("sum = " + sum);
        if (sum==num)
        {
            System.out.println("The number is a whatever number"
            );
        }
        else
        {
            System.out.println("The number is not a whatever number");
        }





    }}