//todo To print the number from 1 to 10

public class Recur1 {

    void numbers(int n){

        if (n>10)
            return;
        else{
            System.out.println(n);
            numbers(++n);
        }
    }

    public static void main(String[] args) {

        Recur1 obj= new Recur1();
        obj. numbers(1);
    }
}
