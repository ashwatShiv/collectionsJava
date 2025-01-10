package map;
import java.util.*;
public class learHashMap {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();

        //adding value in map
        m.put("One", 1);
        m.put("Two", 2);
        m.put("Three", 3);
        m.put("Four", 4);

        //sout map
        System.out.println(m);

        //iteration in map
        for(Map.Entry<String,Integer> p: m.entrySet()){
            System.out.println(p);
            System.out.println(p.getKey());
            System.out.println(p.getValue());
        }

        //want tp print key only 
        for(String s: m.keySet()){
            System.out.println(s);
        }

        // want to print values only 
        for(Integer i: m.values()){
            System.out.println(i);
        }


    }
}
