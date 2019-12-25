import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        davaleba2();
    }


    public static void davaleba2(){
        ArrayList<Star> starsArray = new ArrayList<Star>();
        ArrayList<Planet> plannetsArray = new ArrayList<Planet>();
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.print("ვარსკვლავის დასამატებლად შეიყვანეთ 1, პლანეტის დასამატებლად შეიყვანეთ 2, დამატეიბს გასათიშად შეიყვანეთ 3: ");
            String s = input.nextLine();
            if (s.equals("1")) {
                Star star = new Star();
                star.addStar();
                star.write_in_file();
                starsArray.add(star);
            }else if (s.equals("2")) {
                Planet planet = new Planet();
                planet.addPlanet();
                planet.write_in_file();
                plannetsArray.add(planet);

                for(int i=0; i < starsArray.size(); i++){
                    if(starsArray.get(i).name.equals(planet.star_name)){
                        planet.time = planet.get_time(starsArray.get(i).diameter);
                        starsArray.get(i).planetArr.add(planet);
                    }
                }
                
            }else if (s.equals("3")) {
                break;
            }else break;
        }

        while (true) {
            System.out.print("შეიყვანეთ პლანეტის სახელი ან შეიყვანეთ 2 რათა ნახოთ მთლიანი კოსმოსი, შეიყვანეთ 3 გასათიშად: ");
            String planet_name = input.nextLine();
            if(planet_name.equals("3")){
                break;
            }
            if (planet_name.equals("2")){
                for(int s=0; s<starsArray.size(); s++){
                    starsArray.get(s).get_info();
                }
                for(int p=0; p<plannetsArray.size();p++){
                    plannetsArray.get(p).get_info();
                }
                break;
            }
            for(int i=0; i < plannetsArray.size(); i++) {
                if (planet_name.equals(plannetsArray.get(i).name)) {
                    plannetsArray.get(i).get_info();
                }
            }
        }
    }
}
