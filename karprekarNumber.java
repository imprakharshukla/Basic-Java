public class karprekarNumber {
    public static void main(String[] args) {
         int num=0;
        String numRight = "", numLeft = "";
        for (int k = 4; k <= 5000; ++k) {
            num=k;
            int sq = num * num;
            String num1 = Integer.toString(sq);
            int len = num1.length();  //original length
            int lenHalf = len / 2;       //Half of the Length

            //  WE NEED THE LARGER (lenLeft) on the right
            //  WE NEED THE SMALLER (LenHalf) on the left

                numRight="";
                //RIGHT
                for (int i = lenHalf; i < len; ++i) {
                    char ch = num1.charAt(i);
                    numRight = numRight + ch;

                }
                numLeft="";
                //LEFT
                for (int j = 0; j < lenHalf; ++j) {
                    char ch1 = num1.charAt(j);
                    numLeft = numLeft + ch1;

                }

                int NumRight = Integer.parseInt(numRight);
                int NumLeft = Integer.parseInt(numLeft);
                int sum = NumLeft + NumRight;

                if (sum == num) {
                    System.out.println("The number is "+num);

                }


            }
        System.out.println("The number is "+1);
        }
    }
