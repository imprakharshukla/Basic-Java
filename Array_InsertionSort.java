import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_InsertionSort {
    public static void main(String[] args)throws IOException {
        int a[];

        //INPUTTING

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Please Input the min array's length");
        int len1 = Integer.parseInt(br.readLine());
        a = new int[len1];
        System.out.println("Please Input the array");
        for (int i = 0; i < len1; ++i) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int num;
        int k;

        for(int j=1;j<len1;++j)
        {
             num=a[j];
             k=j-1;
            while(a[k]>num && k>=0)
            {
                a[k+1]=a[k];
                k--;}
                a[k+1]=num;}

        System.out.println("The sorted array is ");

        for(int q=0;q<len1;++q) {
            System.out.println(a[q]);
        }

    }



        }




