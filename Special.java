import java.io.BufferedReader;
import java.io.IOException;

import java.io.InputStreamReader;


public class Special {
    int num,sum,s,r=0;
    void input()throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the number to be checked");
        num=Integer.parseInt(br.readLine());


    }
    int factorial(int b)
    {s=1;
        for (int i=1;i<=b;++i)
        {
            s=s*i;
        }
        return s;
    }
    int sumOfDigits()
    {
        for(int i=num;i!=0;i=i/10)
        {
            r=i%10;
            sum=sum+factorial(r);
        }
        return sum;
    }
    void display()
    {  int SUM=sumOfDigits();
    if (SUM==num)
        System.out.println("The sum of the factorial of the digits is "+ SUM+" and this is equal to the number entered");
        else
    {
        System.out.println("The number is not equal to sum of the factorials " + SUM);
    }
    }

    public static void main(String[] args)throws IOException {
        Special obj=new Special();
        obj. input();
        obj. display();
    }







}
