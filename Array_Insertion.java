import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//DIMENSION ARE GIVEN AS 10
public class Array_Insertion {
    public static void main(String[] args) throws IOException {
    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ir);

        System.out.println("Please Input size of the array");
        int len1 = Integer.parseInt(br.readLine());
        //int Tlen=len1+len2;
        //System.out.println("Tlen = " + Tlen);
        int a[] = new int[len1+1];
        System.out.println("Please Input the first array");
        for (int i = 0; i < len1; ++i) {
            a[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Please Input the number to be added");
        int num = Integer.parseInt(br.readLine());
        System.out.println("Please Input the index number to which the number should be added");
        int pos = Integer.parseInt(br.readLine());

        for(int k = (len1); k>pos ; k--)
        {
             a[k]=a[k-1] ;

        }
        a[pos]=num;

        for(int i = 0; i < len1+1; i++)
        {
            System.out.print(a[i]+",");
        }
        //}
















    }}
