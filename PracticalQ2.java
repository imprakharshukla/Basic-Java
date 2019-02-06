import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticalQ2 {

    public static void main(String[] args)throws IOException {

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(ir);
        String senss[];
        String sens="";

        System.out.println("Enter the string with multiple sentences seperated by . or ! or ?");
        String sen=br.readLine();
        int word=0;


        for(int k=0;k<sen.length();++k) {
            char ch = sen.charAt(k);
            if (ch == '.' || ch == '!' || ch == '?') {
                word++;
            }
        }


        senss=new String [word];

        // sen contains the string with multiple sentences
        int n=0;
        for(int yh=0;yh<sen.length();++yh)
        {
            char ch=sen.charAt(yh);

            if (ch!='.' && ch!='!' && ch!='?')
            {
                sens=sens+ch;

            }

            else if (ch==' ')
            {
                sens=sens+" ";
            }

            else
            {
                //In this else statement we have the one sentence ar a time


                senss[n]=sens+" ";
                ++n;
                sens="";
            }

        }

       // Here we have the sentences separated on diff positions of the String array senss[]






        //Todo sorting begins here!

        for (int i=0;i<senss.length;++i)
        {
            int space=0;
            String temp=senss[i];
            //System.out.println(temp);

            //For obtaining the number of words in the string for dynamic change in the length of the array

            for(int j=0;j<temp.length();++j)
            {
                char ch=temp.charAt(j);
                if (ch==' ')
                ++space;

            }


            String tempAr[]=new String [space];



            // transferring the words in the array
            String worrd="";

            int l=0;
            for(int u=0;u<temp.length();++u)
            {


                char ch=temp.charAt(u);
                if (ch!=' ')
                {
                    worrd=worrd+ch;
                }
                else
                {


                    tempAr[l]=worrd+ch;
                    ++l;
                    worrd="";

                }

            }

//            for(int r=0;r<tempAr.length;++r)
//            {
//                System.out.println(tempAr[r]);
//            }

           sort(tempAr);

            //Now making a string from all the elements of the new array
            String wooord="";
            for (int hj=0;hj<tempAr.length;++hj)
            {
                wooord=wooord+tempAr[hj];

            }

            //Assigning it to the original thread of the parent array

            senss[i]=wooord;
                    wooord="";

        }

        for (int i=0;i<senss.length;++i)
        {
            System.out.print(senss[i]);
        }


    }



    static void sort(String []s) {
        for (int i = 1; i < s.length; i++) {
            String temp = s[i];

            // Insert s[j] at its correct position
            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length()) {
                s[j + 1] = s[j];
                j--;
            }
            s[j + 1] = temp;
        }
    }



}
