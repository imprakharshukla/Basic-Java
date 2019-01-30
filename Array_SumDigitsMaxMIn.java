import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_SumDigitsMaxMIn {
    int ab[];
    int n;

    Array_SumDigitsMaxMIn(int b) {
        n = b;
        ab = new int[n];
        for (int i = 0; i < n; ++i) {
            ab[i] = 0;
        }
    }

    void input() throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter the number to be checked");
        for (int i = 0; i < n; ++i) {
            ab[i] = Integer.parseInt(br.readLine());
        }

    }

    int sum(int a) {
        int sm = 0;
        int r = 0;
        for (int i = a; i != 0; i = i / 10) {
            r = i % 10;
            sm = sm + r;
        }

        return sm;
    }

    void display() {
        int mini=0;int maxi=0;int Minpos=0,Maxpos=0;
        int summer[]=new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.println("The array element is " + ab[i] + "     " + sum(ab[i]));}
        maxi=sum(ab[0]);
        for (int i = 0; i < n-1; ++i) {
            System.out.println("Maxi "+maxi);
            if (sum(ab[i+1])>maxi)
                maxi=sum(ab[i+1]);
        }
    }
    public static void main(String[] args)throws IOException {
        Array_SumDigitsMaxMIn obj=new Array_SumDigitsMaxMIn(6);
        obj. input();
        obj. display();
    }

}


