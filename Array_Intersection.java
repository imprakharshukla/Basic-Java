//Things not complete here..Please keep out of this area!
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_Intersection {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Please Input the first array's length");
        int len1 = Integer.parseInt(br.readLine());
        int a[] = new int[len1];
        System.out.println("Please Input the second array's length");
        int len2 = Integer.parseInt(br.readLine());
        int b[] = new int[len2];
        System.out.println("Please Input the first array");
        for (int i = 0; i < len1; ++i) {
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Please Input the second array");
        for (int j = 0; j < len1; ++j) {
            a[j] = Integer.parseInt(br.readLine());
        }
        int p=0;
        int c[]=new int[len1];
        for (int k = 0; k < len1; ++k) {
        for (int l = 0; l < len2; ++l) {
            if (a[k] == b[k]) {
                System.out.println("The condition is true here bro");
                c[p] = a[k];
                ++p;
            }
            System.out.println("p = " + p);
        }}
        for (int t = 0; t < len1; ++t) {
            System.out.println(c[t]);


        }

        }
    }
