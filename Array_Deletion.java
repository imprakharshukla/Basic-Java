import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_Deletion {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Please Input the first array's length");
        int len1 = Integer.parseInt(br.readLine());
        int a[] = new int[len1];
        System.out.println("Please Input the first array");
        for (int i = 0; i < len1; ++i) {
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Please Input the number to be deleted");
        int num = Integer.parseInt(br.readLine());

        int g=-1;
        for (int y = 0; y < len1; ++y) {
            if (a[y] == num)
            {    ++g;
                for (int z = y; z < len1-1; ++z) {
                    a[z] = a[z + 1];
                }
                --len1;
            } }
            if (g==-1){
            System.out.println("The element was not found");

        }
        else
            {
                System.out.println("The element was deleted....Here goes your array");
                //PRINTING

                for (int u = 0; u < len1; ++u) {
                    System.out.println(a[u]);

                }





            }}}
