package set;
import java.util.*;
public class learnHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<BankDetails> set = new HashSet<>();
        System.out.println("Tell me how many customer you have:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();

            BankDetails ans = new  BankDetails(a,b,c,d);
            set.add(ans);
        }
        for(BankDetails s: set){
            System.out.println(s.customerId);
            System.out.println(s.custName);
        }
        System.out.println(set.size());
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