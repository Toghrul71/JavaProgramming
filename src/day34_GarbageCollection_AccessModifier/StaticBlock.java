package day34_GarbageCollection_AccessModifier;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    static { // static block runs first(before main method) and runs only one time
        System.out.println("Static Block 1");
    }
}
