//todo This program uses the recur technique to find the sum of digits of a number
public class Recur5 {
    int n,sum;

    Recur5(int b)
    {
        n=b;sum=0;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////\

    //This is a for loop implementation of the following recursion

    //  for (int i=n  ;  i!=0   ;  i=i/10)
    //     r=i%10;

    //////////////////////////////////////////////////////////////////////////////////////////////\


    void digits(int n)
    {
        if (n==0)
            return;
        else
        {
            int digit=n%10;
            sum=sum+digit;
            digits(n/10);
        }
    }

    void display()
    {
        digits(n);
        System.out.println("The sum of the digit of the number is "+sum);

    }

    public static void main(String[] args) {
        Recur5 obj=new Recur5(655);
        obj. display();
    }
}
