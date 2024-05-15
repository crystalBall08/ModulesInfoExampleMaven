package labs.pm.sysin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInClass {
    public static void main(String[] args) {
        String s = "";
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Type e to exit: ");
            s = in.readLine();
            System.out.println(s);
            while (s != null) {
                System.out.println("Output: " + s.trim());
                if (s.equals("e")) {
                    System.exit(0);
                }
                System.out.print("Type e to exit: ");
                s = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }
    }
}