import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Emirp {
    //If the number is palendrome and prime
    int num, rev, c;

    void input() throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter the number to be checked");
        num = Integer.parseInt(br.readLine());
    }

    int reverse() {
        int r = 0, s = 0;
        for (int i = num; i!=0; i=i/10) {
            r = i % 10;
            s =(s*10)+r;
        }
        System.out.println("s = " + s);
        return s;

    }

    int factors() {
        int c=0;
        for (int j = 1; j <= num; ++j)
        {
            if (num%j==0)
            { ++c;}
        }

        return c;
    }

    void display()
    { int fac=factors();
        if (reverse()==num && fac==2)
        {System.out.println("c = " + c);

            System.out.println("The number is an emirp number");
        }
        else
            System.out.println("The number is not an emirp number");

    }
    public static void main(String[] args)throws IOException {
        Emirp obj=new Emirp();
        obj. input();
        obj. display();
    }
}
