import java.util.Scanner;

/**
 * Created by jl_ra on 8/28/2016.
 */
public class FizzBuzz {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int userEntry;

        System.out.println("How high do we want to count to?");
        userEntry = scan.nextInt();

        for (int i = 1;i <= userEntry; i++)
        {
            if ((i % 3!=0) && (i%5)!=0) System.out.print(i);
            if (i%3 == 0) System.out.print("Fizz");
            if (i%5 == 0) System.out.print("Buzz");
            System.out.println();
        }
    }
}