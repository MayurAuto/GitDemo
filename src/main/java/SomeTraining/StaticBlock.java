package SomeTraining;

public class StaticBlock {

    static String s;
    static int i;

    static {
        s = "Mayur";
        i = 14;
    }
    public static void main(String args[]){
        System.out.println(StaticBlock.s = "Hey there");
    }
}
