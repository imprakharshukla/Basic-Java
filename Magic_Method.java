import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Magic_Method {
    int num;

    void enter()throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        System.out.println("Enter the number to be checked");
        num=Integer.parseInt(br.readLine());
    }
    int digits(int n)
    {int r=0,p=0;
        for (int i=num;i>0;i=i/10)
        {r=i%10;
            p=p+r;
        }
        return p;
    }

    int sum() {
        int s=0;
        while (num >= 10){

            s = digits(num);
            num = s;
        }
        return s;
    }
    void display()
    { int check=sum();
    if (check<=9)
    {
        System.out.println("The number is a Magic number");
    }
    else
        System.out.println("NO");
    }
    public static void main(String[] args)throws IOException {
        Magic_Method obj=new Magic_Method();
        obj. enter();
        obj. display();
    }
}
