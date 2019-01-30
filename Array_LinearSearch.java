import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_LinearSearch {
    public static void main(String[] args)throws IOException {
        int a[];
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Please Input the min array's length");
        int len1 = Integer.parseInt(br.readLine());
        a = new int[len1];
        System.out.println("Please Input the min array");
        for (int i = 0; i < len1; ++i) {
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Please Input the number to be searched");
        int num = Integer.parseInt(br.readLine());

        int p=-1,pos=-1;
        for(int i=0;i<len1;++i)
        {
            if (a[i]==num)
            {
               p=p+1;pos=i;
               break;
            }
        }
    if (pos==-1&&p==-1)
    {
        System.out.println("404! The element not found!");

    }
    else
    {
        System.out.println("The element "+num +" was found at the index number "+ pos);
    }


    }

}
