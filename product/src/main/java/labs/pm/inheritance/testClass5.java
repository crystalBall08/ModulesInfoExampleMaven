package labs.pm.inheritance;

public class testClass5 implements TestInterface {
    @Override
    public double calculateTax() {
        return 0;
    }

    //you cannot have an abstract method in a non-abstract class
//    public abstract double calculateTax();
}