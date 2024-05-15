package labs.pm.colors;

public interface Red extends Black {
    default void getColor(){
        System.out.print("Red");
    }
}