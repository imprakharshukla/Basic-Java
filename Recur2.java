//todo This programs finds the square of the numbers from n to 1
public class Recur2 {

    int sum,n;

    Recur2(int b)
    {
        n=b;
        sum=0;
    }

    void numbers()
    {
        if(n<1)
            return;
        else {

            int sq=n*n;
            sum=sum+sq;
            --n;
            numbers();
        }
        }

        void display(){


            System.out.println("The sum of the squares is "+ sum);

        }

    public static void main(String[] args) {
        Recur2 obj= new Recur2(3);
        obj. numbers();
        obj. display();

    }
    }

