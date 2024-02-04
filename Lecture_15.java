import java.util.*;
public class Lecture_15 {
    public static void main(String[] args) {
        ArrayList<String> countries=new ArrayList<String>();
        countries.add("India");
        countries.add("Usa");
        countries.add("Pakistan");
        countries.add("Sri Lanka");

        for(int i=0;i<countries.size();i++){
            System.out.println(countries.get(i));
        }
        countries.set(2,"England");
        System.out.println(countries.get(2));

        countries.remove(2);
        System.out.println(countries.get(2));
        
    }
    
}
