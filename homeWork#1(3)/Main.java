import java.util.Scanner;
import java.util.Random;


public class Main {

  public static void main(String[] args) {
    System.out.println("Please, enter values of a and b:");
    Scanner firstInput= new Scanner(System.in);
    int a = firstInput.nextInt();
    int b = firstInput.nextInt();


    Random firstRandom = new Random();

        int  initialEven = 0;
        int  initialOdd = 0;
        int  initialSumEven = 0;
        int  initialSumOdd = 0;

        if(a > b)

        {
            int m = a;
            a = b;
            b = m;
        }

        for(int i=1; i<=40; i++ )

        {
            int getRandNum = firstRandom.nextInt(b-a) + a;
            System.out.println("Random Number: " + getRandNum);

            if(getRandNum % 2 != 0)

            {   
                initialOdd += 1;
                initialSumOdd += getRandNum;
                
            }

            else

            {
                initialEven += 1;
                initialSumEven += getRandNum;
            }
        }

        System.out.println("Quantity Of Even numbers: "+ initialEven);
        System.out.println("Quantity Of Odd numbers: "+ initialOdd);
        System.out.println("Sum of even numbers: "+ initialSumEven);
        System.out.println("Sum of odd numbers: "+  initialSumOdd);

        
        for(int t=1; t<=5; t++ )

        {
            if(initialSumEven > initialSumOdd)

            {
               System.out.println("Sum_Random Number: " + firstRandom.nextInt(initialSumEven) +  initialSumOdd);
            }

            else

            {
                System.out.println("Sum_Random Number: " + firstRandom.nextInt( initialSumOdd) + initialSumEven);
            }
            
        }
    }
}

