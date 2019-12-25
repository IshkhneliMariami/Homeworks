import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Planet{
    String name;
    String star_name;
    Double distance_from_star;
    Double speed;
    double time;

    public void addPlanet() {
        Scanner input = new Scanner(System.in);
        System.out.print("პლანეტის სახელი: ");
        this.name = input.nextLine();
        System.out.print("ვარსკვლავის სახელი: ");
        this.star_name = input.nextLine();
        System.out.print("მანძილი ვარსკვლავიდან: ");
        this.distance_from_star = input.nextDouble();
        System.out.print("პლანეტის სიჩქარე: ");
        this.speed = input.nextDouble();

    }
    public void get_info() {
        System.out.println("პლანეტის სახელი - "+this.name);
        System.out.println("ვარსკვლავის სახელი - "+this.star_name);
        System.out.println("მანძილი ვარსკვლავიდან - "+this.distance_from_star);
        System.out.println("პლანეტის სიჩქარე - "+this.speed);
        System.out.println("ბრუნვის დრო - "+this.time);
    }
    public double get_time(double star_diameter){
        return (star_diameter/2+this.distance_from_star)*Math.PI/this.speed;
    }


    public void write_in_file(){
        try{
            File file = new File("kosmosi.txt",true);;
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("პლანეტის სახელი - "+this.name);
            bw.write(System.lineSeparator());
            bw.write("ვარსკვლავის სახელი - "+this.star_name);
            bw.write(System.lineSeparator());
            bw.write("მანძილი ვარსკვლავიდან - "+this.distance_from_star);
            bw.write(System.lineSeparator());
            bw.write("პლანეტის სიჩქარე - "+this.speed);
            bw.write(System.lineSeparator());
            bw.write("ბრუნვის დრო - "+this.time);
            bw.write(System.lineSeparator());
            bw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


}
