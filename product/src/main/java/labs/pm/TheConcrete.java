package labs.pm;



public class TheConcrete implements InterfaceOne, InterfaceTwo {

    public static void main(String[] args) {
        TheConcrete theInstance = new TheConcrete();
        //it will use the default
        //private methods on interfaces are helper methods and only acessible on the interface itself
        //this is implemented on java 9 onwards
        theInstance.method();
//        theInstance.field;
    }
}