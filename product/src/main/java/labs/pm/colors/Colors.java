package labs.pm.colors;

public class Colors implements Black, Red, Gold {
    public static void main(String[] args) {
        Colors colors = new Colors();
        colors.getColor();
        Gold.getColor();
    }
}