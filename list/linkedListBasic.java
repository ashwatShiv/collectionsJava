package list;
import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class linkedListBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println(inserAtFirst(head, 1));
       
        System.out.println(insertAtLast(head, 100));
        
        Node curr = head;
        while(curr!=null){
            System.out.println(curr.data+" ");
            curr = curr.next;
        }

        System.out.println("Which element you want to search:");
        int target = sc.nextInt();
        boolean ans = searchInList(head, target);
        System.out.println(ans);
    }
    public static boolean searchInList(Node head, int target){
        while(head != null){
            if(head.data == target){
                return true;
            }
            head = head.next;
        }
        return false;
    }
    public static Node inserAtFirst(Node head, int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }
    public static Node insertAtLast(Node head, int value1){
        Node newNode = new Node(value1);
        if(head == null){
            return newNode;
        }

        Node curr= head;
        while(curr.next ==null){
            curr = curr.next;
        }
        curr.next = newNode;
        return head;
    }
    
}
