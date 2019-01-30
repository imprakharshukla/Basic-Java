//todo This Program uses the recur function to count the number of upper and lower case letters in a string

public class Recur4 {
    String str;int cap,small;
    Recur4(String b)
    {
        str=b;
    }

    void count(int l)
    {
        if(l<0)
            return;
        else
        {
            char ch=str.charAt(l);
            if(Character.isUpperCase(ch))
                cap++;
            else
                if (ch!=' ')
                small++;

            count(--l);
        }
        }

        void display()
        {
            count(str.length()-1);
            System.out.println("The number of UpperCase letters is "+cap);
            System.out.println("The number of LowerCase letters is "+small);
        }

    public static void main(String[] args) {

        Recur4 obj=new Recur4("PRaKhar SHuklA");
        //6 cap 7 small
        obj. display();
    }
    }


