package labs.pm.inheritance;

public class testClass3 implements TestInterface {
    public double calculateTax(double tax){
        return 1;
    }

    @Override
    public double calculateTax() {
        return 0;
    }


    //


}