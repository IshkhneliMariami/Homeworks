import java.util.*;

public class Main {

  ArrayList<Integer> arr = new ArrayList<Integer>();

  public void arr(){
      Random r = new Random();

      for(int i=0;i<12;i++) {
            arr.add(r.nextInt(1000));
        }

        Collections.sort(arr);
        System.out.println("Initial Sorted ArrayList: "+ arr);

  }

  public void removedEvens(){
        Iterator iter = arr.iterator(); 
        while (iter.hasNext()) 
        { 
            int num = (Integer)iter.next(); 
          
            if (num % 2 == 0 ) 
                iter.remove(); 
        
        }
        Collections.sort(arr);
        System.out.println("Modified Sorted ArrayList: " + arr); 
    } 

  public static void main(String[] args) {

      Main m = new Main();
      m.arr();
      m.removedEvens();
  }
 
}
