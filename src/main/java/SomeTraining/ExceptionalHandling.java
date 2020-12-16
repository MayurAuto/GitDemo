package SomeTraining;

public class ExceptionalHandling {
    public static void main(String args[]) {
        int j = 7;
        int i = 0;
        try {
            int r[] = new int[5];
            System.out.println(r[5]);

        }
        catch (ArrayIndexOutOfBoundsException t){
            System.out.println("Hey im right");
        }
        catch(ArithmeticException t){
            System.out.println("where i belong to");
        }
        catch (Exception e){
            System.out.println("in here catch");
        }

        finally {
            System.out.println("i will survive everytime");
        }
    }
}
