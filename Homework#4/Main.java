import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String lang;
        String para;
        Scanner s = new Scanner(System.in);
          lang = s.nextLine();
          para = s.nextLine();
       
        String[] paraArr = para.split("-");
        ArrayList param = new ArrayList();
        for (String parameter: paraArr) {

            try {
               param.add(Integer.parseInt(parameter));
            } catch (NumberFormatException e) {
             
            }
        }
        System.out.println(param);
        Generator generator = new Generator(lang, param);
        generator.genAlph();
        System.out.println(generator.genChar());
    }
}
