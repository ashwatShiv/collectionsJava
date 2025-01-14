import java.util.*;

public class practice{
    public static void main(String[] args) {
        String s = "Automation";
        String s2 = new String("Automation");

        //charAt() function return character at given index, return type is char 
        System.out.println(s.charAt(3));



        //codePointAt() return unicode of perticular index character, return type int
        System.out.println(s.codePointAt(3));

        //compareTo() this function compare both the strings and return 0(true) and other int 
        System.out.println(s.compareTo("hello"));

        //concat() this method append string after another string return type string 
        System.out.println(s.concat(s2));
        System.out.println(s.concat(" Testing"));

        //contains() check wether the string contain sequence of character, return type boolean
        System.out.println(s.contains(s2));
        System.out.println(s.contains("toc"));

        //copyValueOf(arr,startIdx, endIdx) this will copy the value from start index to endindex in string return type string
        char[] arr = {'a','s','h','w','a','t'};
        String cp = "";
        cp = cp.copyValueOf(arr,0,6);
        System.out.println(cp);

        //endsWith() this check wether the string is ended with particular character return boolean
        System.out.println(cp.endsWith("t"));

        //equals() compare two string by there value, return boolean 
        System.out.println("equals method below:");
        System.out.println(s.equals(s2));
        System.out.println(s.equals(cp));


    }

}