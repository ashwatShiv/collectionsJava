package set;
import java.util.*;
public class learnHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        //learning .add funtion in set 
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        // printing set using sout
        System.out.println(set);

        //now checking is set is empty
        System.out.println(set.isEmpty());

        //checking set is containing any specific value
            System.out.println(set.contains(20));
        
        // now working on .remove 
        set.remove(20);

        System.out.println(set);

        //now want to clear whole set 
        set.clear();
        System.out.println(set.isEmpty());
        System.out.println(set);







    //     System.out.println("Tell me how many customer you have:");
    //     int n = sc.nextInt();
    //     for(int i=0; i<n; i++){
    //         int a = sc.nextInt();
    //         sc.nextLine();
    //         String b = sc.nextLine();
    //         String c = sc.nextLine();
    //         int d = sc.nextInt();

    //         BankDetails ans = new  BankDetails(a,b,c,d);
    //         set.add(ans);
    //     }
    //     for(BankDetails s: set){
    //         System.out.println(s.customerId);
    //         System.out.println(s.custName);
    //     }
    //     System.out.println(set.size());
    // }
}
}
class BankDetails{
    int customerId;
    String custName;
    String email;
    int totalAmount;

    public BankDetails(int customerId, String custName, String email, int totalAmount){
        this.customerId = customerId;
        this.custName = custName;
        this.email = email;
        this.totalAmount = totalAmount;
    }

}