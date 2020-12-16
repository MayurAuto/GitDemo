package SomeTraining;

public class MultiMin {
    public static void main(String args[]){
        int min = 0;
        int minColumn = 0;
        int ab[][] = {{2,4,5},{4,9,8},{1,0,6}};
        min = ab[0][0];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(ab[i][j] < min){
                    min = ab[i][j];
                    minColumn = j;
                }
            }
        }
        System.out.println(min);
        int max = ab[0][minColumn];
        int k = 0;
        while(k < 3){
            if(ab[k][minColumn] > max){
                max = ab[k][minColumn];
            }
            k++;
        }

        System.out.println(max);

    }
}
