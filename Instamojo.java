import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Instamojo {


    public static void main(String[] args)throws IOException {

        String response;
        InputStreamReader ir= new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);

        System.out.println("Input the success response");
        response=br.readLine();

        int io=response.indexOf("paymentId");
        int iopay=io+9;
        String paymentNumber=response.substring(iopay+1,io+30);
        System.out.println(paymentNumber);


    }

}
