package labs.pm.enumprob;

public class EnumTEst {

    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.println(p.getDistace());
        }
    }
}
