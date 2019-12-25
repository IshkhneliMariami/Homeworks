import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Star {
    String name;
    Double diameter;
    Double temperature;
    ArrayList<Planet>  planetArr = new ArrayList<Planet>();

    public void addStar() {
        Scanner input = new Scanner(System.in);
        System.out.print("ვარსკვლავის სახელი:");
        this.name = input.nextLine();
        System.out.print("ვარსკვლავის დიამეტრი: ");
        this.diameter = input.nextDouble();
        System.out.print("ვარსკვლავის ტემპერატურა: ");
        this.temperature = input.nextDouble();
    }

    public void get_info() {
        System.out.println("ვარსკვლავის სახელი - "+this.name);
        System.out.println("ვარსკვლავის დიამეტრი - "+this.diameter);
        System.out.println("ვარსკვლავის ტემპერატურა - "+this.temperature);
    }
    public void write_in_file(){
        try{
            File file = new File("kosmosi.txt",true);;
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("ვარსკვლავის სახელი- "+this.name);
            bw.write(System.lineSeparator());
            bw.write("ვარსკვლავის დიამეტრი - "+this.diameter);
            bw.write(System.lineSeparator());
            bw.write("ვარსკვლავის ტემპერატურა - "+this.temperature);
            bw.write(System.lineSeparator());
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
