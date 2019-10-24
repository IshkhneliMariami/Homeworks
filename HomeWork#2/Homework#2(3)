import java.io.*;
import java.util.*;

public class Main implements initialInter {

    private int a, b;

    Main (int a, int b){
         this.a = a;
         this.b = b;
    }

    @Override
    public void firstMethod() {

        System.out.print("Numbers between "+ a+" and "+b +" are: ");

        for (int t=a;t<=b;t++){
            System.out.print(t + ";");
        }
    }


    @Override
    public void secondMethod() {

        System.out.print("\nDivisors of "+a+"  are: ");

        for (int t=1; t <= a; t++){
            if (a % t == 0){
                System.out.print(t + ";");
            }
        }
    
    }

    @Override
    public void  thirdMethod() {

        System.out.print("\nPrime divisors of "+b+" are: ");
  
        while (b % 2 == 0) {
            System.out.print(2 + " ");
            b /= 2;
        }
        for (int i = 3; i <= Math.sqrt(b); i += 2) {
            while (b % i == 0) {
                System.out.print(i + " ");
                b /= i;
            }
        }
        if (b > 2)
            System.out.println(b);
 
   }

 
    
        @Override
        public  int fourthMethod(int t) { 

        if (t < 0) 
           t = -t; 
  
           int res = 0;  
           int count = 1;  

           for (int r = 0; r <= 9; r++) 
      { 
                int c =  quantity(t,r); 

                if (c >= count) 
      { 
                   count = c; 
                   res = r; 
      } 
  }   
                return res; 

   }       

        int  quantity(int t, int r) 
     { 
             int c = 0;  
             while (t > 0) 
      { 
             if (t % 10 == r) 
                 c++; 
                 t = t / 10; 
    } 
        return c; 
}



    public static void main(String[] args) {

     Main lastRes = new Main(10,24);
     lastRes.firstMethod();
     lastRes.secondMethod();
     lastRes.thirdMethod();
     System.out.println("The most frequent digit in b is: "+ 
     lastRes.fourthMethod(155112));    
      
   }

}






 

