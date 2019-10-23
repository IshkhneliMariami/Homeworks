import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class Main {

    public static void main(String[] args) throws 
    
    IOException {

        BufferedReader rdBf = new BufferedReader(new FileReader("function.txt"));

        String st;
        List<Double> nums = new ArrayList<>();

        while ((st = rdBf.readLine()) != null){
            nums.add(Double.parseDouble(st));
        }

        rdBf.close();

        System.out.println("Minimum number in function.txt is: " + Collections.min(nums));
        System.out.println("Maximum number in function.txt is: " + Collections.max(nums));

   }
}

