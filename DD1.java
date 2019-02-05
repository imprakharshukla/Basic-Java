import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DD1 {
    int a[][]= new int [3][3];



    DD1()  //DD is def. conc.
    {
        for (int i=0;i<a.length;++i)
        {
            for (int j=0;j<a.length;++j)
            {
                a[i][j]=0;
            }
        }

    }
     void input()throws IOException
     {
         InputStreamReader ir= new InputStreamReader(System.in);
         BufferedReader br= new BufferedReader(ir);

         System.out.println("Please enter the double dimensional array in it's original form");

         for (int i=0;i<a.length;++i)
         {
             for (int j=0;j<a.length;++j)
             {
                 a[i][j]=Integer.parseInt(br.readLine());
             }
         }


     }

     void sum()
     {
         int summ=0;
         int sumRow=0;
         int sumCol=0;
         int p=-1;

         for (int i=0;i<a.length;++i)
         {
             for (int j=0;j<a.length;++j)
             {
                 summ=summ+a[i][j];//The sum calculation of the entire DD array

                 sumCol=sumCol+a[j][i];//For columns

                 sumRow=sumRow+a[i][j];//For Rows

                 p=j;
             }

             System.out.println("The sum of row "+i+" is "+sumRow);
             System.out.println("The sum of column "+p+" is "+sumCol);

             sumRow=0;sumCol=0;
         }



         System.out.println("The sum of the array is "+summ);

     }


     void display()
     {

         // TO print the array once

         for (int i=0;i<a.length;++i)
         {
             for (int j=0;j<a.length;++j)
             {
                 System.out.print(a[i][j]);
             }

             System.out.println();
         }



     }


    public static void main(String[] args)throws IOException{

        DD1 obj=new DD1();
        obj. input();obj. display();obj. sum();


    }

}
