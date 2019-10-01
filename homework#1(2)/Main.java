public class Main{

 public static void main(String[] args) {
     
        A lastRes = new A();
        lastRes.firstMethod();
        lastRes.secondMethod();
        lastRes.thirdMethod();
        
        B anotherLastRes= new B();
        anotherLastRes.anotherFirstMethod();
        anotherLastRes.firstMethod();
        System.out.println(anotherLastRes.anotherSecondMethod());
      }
    }
