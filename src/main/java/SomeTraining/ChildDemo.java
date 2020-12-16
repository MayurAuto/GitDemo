package SomeTraining;



public class ChildDemo extends SuperDemo {
    public ChildDemo(){
        super();
        System.out.println("this is a Child class");
    }
    public static void main(String[] args){
        ChildDemo r = new ChildDemo();
    }
}
