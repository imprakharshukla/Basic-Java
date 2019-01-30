import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Perfect_Number
{
    public static void main(String[] args)throws IOException {
        int s = 0;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Please Input the number");
        int num = Integer.parseInt(br.readLine());


        for (int i = 1; i < num; ++i) {
            if (num % i == 0) {
                s = s + i;
            }
        }
        if (s == num) {
            System.out.println("The number is a perfect number");

        }
        else {
            System.out.println("Sorry the number is not a perfect number");
        }
        }
    }

