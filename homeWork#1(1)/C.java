import java.util.Scanner;

public class C {

  int a,b,c,res;
  public  void firstMethod(){
      System.out.println("Please, enter values of a,b and c");
      Scanner firstInput= new Scanner(System.in);
       a = firstInput.nextInt();
       b = firstInput.nextInt();
       c = firstInput.nextInt();

  }
  public int secondMethod(){
             return a%10;
    }

  public int thirdMethod(){
       while (b >= 10)  
              b/= 10;
              return b;
}
   public int fourthMethod(){
          int sum = 0;
          while (c > 0) {
            sum += c % 10;
            c /= 10;
        }
          return sum;
   }

   public void fithMethod(){

        res = secondMethod()*thirdMethod();
        System.out.println(res);
   }

   public void sixthMethod(){
       System.out.println(thirdMethod()+res);
   }
   

    public static void main(String[] args) {

        C lastRes = new C();
        lastRes.firstMethod();

        System.out.println("Last Digit Of a: "+ lastRes.secondMethod());
        System.out.println("First Digit Of b: " + lastRes.thirdMethod());
        System.out.println("Sum Of Digits Of c: " + lastRes.fourthMethod());
        System.out.println("secondMethod multiplied by thirdMethod:");
        lastRes.fithMethod();
        System.out.println("Sum of thirdMethod and fithMethod:");
        lastRes.sixthMethod();
    }

  }

        


