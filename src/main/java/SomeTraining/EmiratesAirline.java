package SomeTraining;

public class EmiratesAirline extends HideData{
    public static void main(String args[]){
        EmiratesAirline e = new EmiratesAirline();
        e.safetyGuideline();
        e.checkSecurity();
        e.whatColour();
    }

    @Override
    public void whatColour() {
        System.out.println("Emirates 4045 colour will be blue");
    }
}
