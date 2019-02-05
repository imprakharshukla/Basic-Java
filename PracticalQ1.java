

//Please read before proceeding to the code.

//The code is written in methods for the easier understanding of the code. This whole program can be done is half the
//code but the purpose of this code is to be clear and
//define the position of each element.


// Todo This program can also be done via Strings. The program will be fundamentally same. Try it!


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalQ1 {

    //In order to access the array from other functions, it needs to be defined as a global variable.
    static int[] a=new int [3];
    static int b[]=new int [4];


    //Two arrays are take (one for //three// and one for //four// digit numbers)

    public static void main(String[] args)throws IOException {

        int m,n;int c=0;

        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Please enter the limits to find all the unique numbers");
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());

        //This is the main condition of the code

        if(m<=n && m>=100 && n>=100 && m<=5000 && n<=5000)
        {
            for (int i=m;i<=n;++i)
            {
                int k=0;
                int nn=getNoDigits(i);//This returns us the number of digits

         //  ================================================== For 3 digits ================================================================

                if (nn==3)
            {
                for (int j=i;j!=0;j=j/10)
                {

                    int r=j%10;
                    a[k]=r;
                    ++k;

                }


                if(isUniqueTwo())
                {
                    System.out.println(i);
                    c++;

                }

            }

          //  ================================================== For 4 digits ================================================================


                if (nn==4)
                {
                    for (int j=i;j!=0;j=j/10)
                    {

                        int r=j%10;
                        b[k]=r;
                        ++k;

                    }


                    if(isUniqueThree())
                    {
                        System.out.println(i);
                        c++;

                    }

                }



            }

            if (c==0)
                System.out.println("No unique number found");
            else
                System.out.println("The total number of unique numbers found are "+c);


        }



    }


    static int getNoDigits(int num)
    { int no=0;
        for (int i=num;i!=0;i=i/10)
        {
            ++no;
        }
        return no;
    }


    static boolean isUniqueTwo()
    { int p=0;
     for (int i=0;i<a.length;++i)
        {
            if (a[0]!=a[1] && a[0]!=a[2] && a[1]!=a[2])
                ++p;
        }

        if(p!=0)
            return true;
     else
         return false;


    }

    static boolean isUniqueThree()
    { int p=0;
        for (int i=0;i<a.length;++i)
        {
            if (a[0]!=a[1] && a[0]!=a[2] && a[0]!=a[3] && a[1]!=a[2] && a[1]!=a[3] && a[2]!=a[3])
                ++p;
        }

        if(p!=0)
            return true;
        else
            return false;


    }

}
