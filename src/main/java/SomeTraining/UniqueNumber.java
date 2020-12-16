package SomeTraining;

import java.util.ArrayList;

public class UniqueNumber {
    public static void main(String args[]){

        int a[] = {3,7,5,3,6,5,7};


        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i = 0; i < a.length; i++){
            int k = 0;
            if(!ar.contains(a[i])){
                ar.add(a[i]);
                k++;
                for(int j = i + 1; j < a.length; j++){
                    if(a[i] == a[j]){
                    k++;
                    }
                }

                System.out.print(a[i]);
                System.out.println("  "+k);
            }

        }

    }
}
