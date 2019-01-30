import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_SelectionSort {
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

        for (int k = 0; k < len1; ++k) {
            int num=a[k];int p=k;
            for(int j=k+1;j<len1;++j)
            {
                if (num>a[j])
                {
                    num=a[j];
                    p=j;
                }
            }
            a[p]=a[k];
            a[k]=num;
        }
        System.out.println("The sorted array is ");

        for(int q=0;q<len1;++q) {
            System.out.println(a[q]);
        }


        }
}
