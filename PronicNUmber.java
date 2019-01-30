import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PronicNUmber {
    public static void main(String[] args) throws IOException {
            int fac[];

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Input the Number to be checked");
        int num = Integer.parseInt(br.readLine());
int z=-1;
    for (int i=1;i<=(int) Math.sqrt(num);++i)
    {
        System.out.println("i = " + i);
        if (num==i*(i+1));
        {
           ++z;}

    }
if (z==-1)
{
    System.out.println("No");
}
else
{ System.out.println("The number is a pronic number");}






    }



}
