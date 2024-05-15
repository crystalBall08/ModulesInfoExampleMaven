package labs.pm;

public interface InterfaceOne {
    int field = 99;
    default void method() {
        System.out.print(field);
    }
}
