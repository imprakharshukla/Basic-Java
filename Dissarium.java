import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dissarium {
    int num,sum;

    void enter()throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the number to be checked");
        num=Integer.parseInt(br.readLine());
    }

    int count()
    {int r=0,c=0;
        for (int i=num;i!=0;i=i/10)
        {
            r=i%10;
            ++c;
        }
        System.out.println("c = " + c);
        return c;
    }
    void SumOfDigits()
    {
    int r;
    int x=count()+1;
        System.out.println("x = " + x);
    for (int i=num;i!=0;i=i/10)
    {
        r=i%10;
        sum=sum+(int)Math.pow(r,--x);
        System.out.println("r = " + r);
        System.out.println("sum = " + sum);
    }
    }

    void display()
    {  SumOfDigits();
        if(sum==num)
        {
            System.out.println("The number is a dissarium number");
        }
        else
            System.out.println("Oops! This number is not what you're looking for");
    }
    public static void main(String[] args)throws IOException {
        Dissarium obj=new Dissarium();
        obj. enter();
        obj. count();
        obj. display();
    }
}
