package list;
import java.util.*;

public class practiceLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many cutomer you want to enter");
        int n = sc.nextInt();

        LinkedList<BankDetails> ls = new LinkedList<>();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();

            BankDetails ans = new  BankDetails(a,b,c,d);
            ls.add(ans);
        }
        sc.nextLine();
        

    // traversing linked list
    for(BankDetails s: ls){
        System.out.println(s.customerId);
        System.out.println(s.custName);
    }

    ls.removeLast();

    for(BankDetails s: ls){
        System.out.println(s.customerId);
        System.out.println(s.custName);
    }



    System.out.println("Which customer you want to search");
    String target = sc.nextLine();
    if(presenceDetector(ls, target)){
        System.out.println("This customer exist in our bank");
    }else{
        System.out.println("Customer not found");
    }
    }
    public static boolean presenceDetector(LinkedList<BankDetails> ls, String target){
        for(int i=0; i<ls.size(); i++){
            if(ls.get(i).custName.equalsIgnoreCase(target)){
                return true;
            }
        }
        return false;
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
