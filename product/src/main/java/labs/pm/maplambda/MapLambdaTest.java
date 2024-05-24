package labs.pm.maplambda;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapLambdaTest {


    public static void main(String[] args) {
        Set<String> islandNations = Set.of("Australia", "Japan", "Taiwan", "Cyprus", "Cuba");
//        Set<String> islandNations2 = Set.of("Aaust", "Cuba", "Australia", "Japan", "Taiwan", "Cyprus");
        islandNations = islandNations.stream()
//                .map(swap)
//                .map(n -> n.substring(0, 1))
                .collect(Collectors.toSet());
        for (String s : islandNations) {
            System.out.println(s);
            int hashCode = s.hashCode();
            System.out.println("Hash code of '" + s + "' : " + hashCode);
//            System.out.print(s);
        }
    }


    public static Function<String, String> swap = s -> {
        if (s.equals("Australia"))
            return "New Zealand";
        else
            return s;
    };
}
