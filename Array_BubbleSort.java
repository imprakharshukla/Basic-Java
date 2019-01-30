import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_BubbleSort {
    public static void main(String[] args)throws IOException {
        int a[];

        //INPUTTING

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Please Input the min array's length");
        int len1 = Integer.parseInt(br.readLine());
        a = new int[len1];
        System.out.println("Please Input the min array");
        for (int i = 0; i < len1; ++i) {
            a[i] = Integer.parseInt(br.readLine());
        }

         //SORTING
        int t=0;
        for(int k=0;k<len1;++k) {
            for (int j = 0; j < len1 - k - 1; ++j)
            {
                if (a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("The sorted array is ");

        for(int q=0;q<len1;++q) {
            System.out.println(a[q]);
        }



         }


         }
