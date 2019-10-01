import java.util.Scanner;

class A {

  int x;
  public A() {
      System.out.println("Hello");
   }

  public  void firstMethod(){
      System.out.println("Please, enter value of x");
      Scanner firstInput= new Scanner(System.in);
              x= firstInput.nextInt();
  }

  public void secondMethod() {
         System.out.println("x + 12 =" + (x+12));
  }

  public void thirdMethod() {
         if(x % 2==0)
           System.out.println("x is even");
         else
           System.out.println("x is odd");
  }

}
