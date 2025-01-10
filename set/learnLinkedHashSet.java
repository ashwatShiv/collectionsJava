package set;
import java.util.*;
import java.util.LinkedHashSet;

public class learnLinkedHashSet {
    public static void main(String[] args) {
        //property- it has set properties as well as linked list properties
        //in this type of set order of element retian as they are entered
        Set<Integer> set = new LinkedHashSet<>();
        
        //adding element 
        set.add(01);
        set.add(02);
        set.add(23);
        set.add(245);

        //printing the set 
        System.out.println(set);

        //removing element 
        set.remove(23);

        System.out.println(set);

        // clear the set 
        set.clear();
        System.out.println(set);

    }
}
