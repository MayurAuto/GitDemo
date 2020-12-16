package SomeTraining;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

public class MapHash {
    public static void main(String args[]){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "Hey");
        hm.put(1, "Mayur");
        hm.put(2,"pune");
        hm.put(3,"Hey");
        Set u = hm.entrySet();
        //Interator t =  u.iterator();
        Iterator t = u.iterator();
        while(t.hasNext()){
            Map.Entry y = (Map.Entry) t.next();
            System.out.print(y.getKey());
            //System.out.println("\t");
            System.out.println(y.getValue());
        }
    }
}
