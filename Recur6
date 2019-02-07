import java.io.*;
public class prac1 {
    int n,f=1,sum;
    prac1(int b){
        n=b;

    }

    void factorial(int a)
    {
        if(a==0)
            return;
        else
        {
            f=a*f;
            factorial(--a);
            
        }}

        void digi(int u)
        {
            if (u==0)
                return;
            else
            {
                int digit=u%10;
                f=1;
                factorial(digit);
                System.out.println(f);
                sum=sum+f;
                digi(u/10);

            }
        }




    void display(){
        digi(n);

        System.out.print("The sum "+ sum);
    }

    public static void main(String [] args){
        prac1 obj=new prac1(3238484);
        obj. display();


    }


}
