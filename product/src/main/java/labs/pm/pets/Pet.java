package labs.pm.pets;

import java.lang.annotation.Inherited;

//@Inherited
// line n1
public interface Pet {
    public abstract int breed();
    // line n2
    public default Pet callPet(){
        return this;
    }
    // line n3
    @Deprecated(forRemoval=true)
    void speak();
}



//    What is a valid annotation?
//@Deprecated(forRemoval=true) at line n3
//
//@Inherited at line n1
//
//@FunctionalInterface at line n1
//
//@interface at line n1
//
//        @Override at line n2
//
//@Target(METHOD) at line n3