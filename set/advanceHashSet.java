package set;
import java.util.*;
public class advanceHashSet {
    public static void main(String[] args) {
        Set<student> set = new HashSet<>();
        set.add(new student(121, "Ashwat"));
        set.add(new student(123, "rajat"));
        set.add(new student(121, "Ashwat"));

        //display the set 
        for(student s: set){
            System.out.println(s.name);
            System.out.println(s.rollNo);
        }

    }
    
}
class student{
    int rollNo;
    String name;

    public student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode(){
        return Objects.hash(rollNo);
    }
}
