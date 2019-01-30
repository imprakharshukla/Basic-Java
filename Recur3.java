//todo This program uses the recur technique to reverse a string and find the case for a palindrome string

public class Recur3 {
    String str,rev;

    Recur3(String b)
    {
        str=b;
        rev="";


    }

    void reverse(int n)
    {
        if (n<0)
            return;
        else{
        char ch=str.charAt(n);
        rev =rev+ch;
        reverse(--n);
    }}

    void display()
        {

            reverse(str.length()-1);
            if (rev.equalsIgnoreCase(str))
                System.out.println("The strings are palindrome "+str);
            else
                System.out.println("No they are not "+rev);
        }

    public static void main(String[] args) {
        Recur3 obj= new Recur3("Noon");
        obj. display();
    }
    }



