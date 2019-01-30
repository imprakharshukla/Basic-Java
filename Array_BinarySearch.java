import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_BinarySearch {
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

        //SORTING
        int t;
        for (int j = 0; j < len1-1; ++j) {
            for(int l=0;l<len1-1-j;++l)
            if (a[l] > a[l + 1]) {
                t = a[l];
                a[l] = a[l + 1];
                a[l + 1] = t;
            }
        }

        //PRINTING OF THE SORTED ARRAY

        for (int k = 0; k < len1; ++k)

        {
            System.out.println(a[k]);
        }


       //SEARCHING

        int max=len1-1;
        int min=0;
        int p=-1;
        int mid = (min + max)/2;
        while( min <= max ){
            if ( a[mid] < num ){
                min = mid + 1;
            }else if ( a[mid] == num ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                max = mid - 1;
            }
            mid = (min + max)/2;
        }
        if ( min > max ){
            System.out.println("Element is not found!");
        }
    }


}

