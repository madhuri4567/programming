import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
        decimalToBinary(n);
    }
       public static void decimalToBinary( int  num)
        {
            // ArrayList to store binary number
            // here we use arraylist instead of array , to improve space complexity
            ArrayList<Integer> list = new ArrayList<>();

            // pointer for binary array

            while (num > 0)
            {
                // storing remainder in binary array
                list.add(0, num % 2);
                num = num / 2;

            }

            // printing binary arraylist
            System.out.println(list.toString());

        }



        // actuall the concept of this program comes from basic idea 
    }

