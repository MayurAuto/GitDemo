package SomeTraining;

import java.util.ArrayList;

public class ListArrayTesting {
    public static void main(String args[]){
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Hello");
        ar.add("Good");
        System.out.println(ar);
        ar.add(0, "okay");
        System.out.println(ar);
        System.out.println(ar.get(2));
        
        
    }
}
