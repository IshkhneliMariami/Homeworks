import java.util.Scanner;

public class B extends A{

     int y;
     public  void anotherFirstMethod(){
      System.out.println("Please, enter value of y");
      Scanner firstInput= new Scanner(System.in);
              y= firstInput.nextInt();
  }
     public  int anotherSecondMethod(){
             return x+y;
     }
}
