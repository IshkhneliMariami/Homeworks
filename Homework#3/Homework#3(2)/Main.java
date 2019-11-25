import java.util.*;

public class Main{

    ArrayList<Integer> arr = new ArrayList<Integer>();
    Random r = new Random();

    public void arr(){
        for(int i=0; i<12; i++){
            arr.add(r.nextInt(10-5+1)+5);
        }
        System.out.println("Initial ArrayList: "+arr);
    }

    public void newArr(){

         for(int i=0; i<=arr.size();i++){
             if(i%3==0 && i!=0){
                 arr.add(i+1, r.nextInt((25 - 20) + 1) + 20);
             }
         }
         System.out.println("Modified ArrayList: "+ arr);

    }

    public static void main(String[] args) {
    Main m = new Main();
    m.arr();
    m.newArr();

    }

}
