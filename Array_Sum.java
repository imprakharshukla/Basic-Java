import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array_Sum {
    int sum;
    int a[]=new int[5];

    Array_Sum() {
        sum = 0;
        for (int i = 0; i < 5; ++i) {
            a[i] = 0;
        }
    }

    void input() throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Enter the number to be checked");
        for (int i = 0; i < 5; ++i) {
            a[i]=Integer.parseInt(br.readLine());
        }

    }
    void display() {
        for (int i = 0; i < 5; ++i)
            {
                System.out.println(a[i]);
                sum = sum + a[i];

            }
            System.out.println("The sum is "+sum);
        }

    public static void main(String[] args)throws IOException {
        Array_Sum obj=new Array_Sum();
        obj. input();
        obj. display();
    }
    }


