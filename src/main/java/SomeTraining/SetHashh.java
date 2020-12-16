package SomeTraining;

import java.util.HashSet;
import java.util.Iterator;

public class SetHashh {
    public static void main(String args[]){
        HashSet<String> s = new HashSet<String>();
        s.add("Hey");
        s.add("Bye");
        s.add("Nice");
        s.add("Hello");
        s.add("pune");
        s.add("pune");
       // s.add("pune");
        Iterator<String> t = s.iterator();
        while(t.hasNext()){
            String r = t.next();
            System.out.println(r);
        }
    }
}
