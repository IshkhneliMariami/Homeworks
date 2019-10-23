import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main{

    public static void main(String[] args) throws
    
     IOException {

        int [] coord = {1, 2};
        double y;

        BufferedWriter wrBf = new BufferedWriter(new FileWriter("function.txt", true));

        for (int x : coord) {
            
           y = Math.pow(x, 2) + 2 * x + 3;
           wrBf.write(String.valueOf(y));
           wrBf.newLine();
        }

       wrBf.close();
    }

}
