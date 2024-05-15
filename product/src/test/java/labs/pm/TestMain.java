package labs.pm;

import labs.pm.readfile.MyBSClass;
import org.junit.Test;

public class TestMain {

    @Test
    public void testMain(){

        System.out.println("ariel");
        String[] args = new String[2];
        args[0] = "C:\\Users\\ariel.pirante\\IdeaProjects\\ModulesInfoExampleMaven\\files\\file0.txt";
        args[1] = "C:\\Users\\ariel.pirante\\IdeaProjects\\ModulesInfoExampleMaven\\files\\file1.txt";

        MyBSClass.main(args);
    }
}
