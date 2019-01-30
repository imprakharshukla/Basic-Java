//THIS PROGRAM IS NOT YET COMPLETE KINDLY STAY AWAY
//If you want to improve upon this program please commit changes!

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircularPrime {
    public static void main(String[] args) throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println("Input the Number to be checked as a prime number");
        int num = Integer.parseInt(br.readLine());

        int first;
        int last;
        int neu,neu1=0;
        int y=0,w=0;
        //CHECKING FOR A BASIC PRIME
        int c = 0;
        for (int u = 1; u <= num; ++u) {
            if (num % u == 0) {
                ++c;
            }
        }
        //NOW TO MOVING FIR CIRCULAR PRIME
        if (c == 2) {
            first = num / 10;
            last = num % 10;
            neu = first + (last * 100);
            System.out.println("first = " + first);
            System.out.println("last = " + last);
            System.out.println("neu = " +neu);

            int g = 0;
            for (int z = 1; z <= neu; ++z) {
                if (num % z == 0) {
                    ++g;
                    System.out.println("g = " + g);
                }
            }


            if (g == 2) {
               int first1 = num / 10;
                int last1 = num % 10;
               neu1 = first1 + (last1 * 100);
                System.out.println("first1 = " + first1);
                System.out.println("last1 = " + last1);
                System.out.println("neu1 = " +neu1);

                for (int v = 1; v <= neu1; ++v) {
                    if (num % v == 0) {
                        ++y;
                        System.out.println("y = " + y);
                    }
                }

            }


            if (y==2)
            {
                if(num==neu1)
                {
                    System.out.println("The number is a circular prime number");
                }
                else{
                    System.out.println("Not a circular prime");
                }
            }




        }
    }
}
