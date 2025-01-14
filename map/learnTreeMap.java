package map;
import java.util.*;

public class learnTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<>();
        m.put("One", 1);
        m.put("Two", 2);
        m.put("Three", 3);
        m.put("Four", 4);

        //iterate this map
        for(Map.Entry<String, Integer> e: m.entrySet()){
            System.out.println("Key:"+ e.getKey()+" "+ "Value:"+ e.getValue());  
        }

    }
}
