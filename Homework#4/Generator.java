import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class Generator implements GenerateInter {

    private  Hashtable alpha;
    private String lang;
    private ArrayList paras;
    private Random r;

    public Generator(String lang, ArrayList paras) {
        alpha = new Hashtable();
        r = new Random();
        this.lang = lang;
        this.paras = paras;
        System.out.println(paras);
        genAlph();
      

    }

    @Override
    public void genAlph() {

        alpha.put("en", alpha('a', 'z'));
        alpha.put("ge", alpha('ა', 'ჰ'));
        alpha.put("ru", alpha('а' , 'я'));
       
    }

    public String alpha(char s, char e){
        String alpha = "";
        for(int i=(int)s; i<=(int)e; i++){
            alpha += (char)i;
        }
        return alpha;
    }


    @Override
    public char genChar() {
        String  ss =  alpha.get(lang).toString();
        char s = ss.charAt(r.nextInt(ss.length()));
        return s;
    }

    @Override
    public String genWord(int min, int max) {
        String w = "";
        int rand = r.nextInt(max-min+1)+min;
        for(int i=0; i<rand; i++){
            w += genChar();
        }
        return w;
    }

    @Override
    public String genSent(int min, int max) {
        String s = "";
        int rand = r.nextInt(max-min+1)+min;
        for(int i=0; i<rand; i++){
            s += genChar();
        }
        return s;
    }
       
    
}
