package list;
import java.util.*;


public class PracticeArrayList {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> ls = new ArrayList<>();
    ls.add("ashwat");
    ls.add("ashish");
    ls.add("abhay");
    ls.add("ram");
    ls.add("ramesh");
    ls.add("kratik");
    ls.add("anuj");

    //printing the list
    System.out.println(ls);

    // traversing the list 

    // for(String s: ls){
    //     System.out.println(s);
    // }

    // want to check wether it contain that element or not 
    System.out.println("tell me what you have to find:");
    String x = sc.nextLine();
    System.out.println("Now which value you want to replace:");
    String q = sc.nextLine();
    if(ls.contains(x)){
        for(int i =0; i<ls.size(); i++){
            if(ls.get(i).equalsIgnoreCase(x)){
                ls.set(i, q);
            }
        }
        System.out.println("Result after updation:");
    for(String s: ls){
        System.out.println(s);
    }
    }else{
        System.out.println("No such element present");
    }
    
    

}
    
}