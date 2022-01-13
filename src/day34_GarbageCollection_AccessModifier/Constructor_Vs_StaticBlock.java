package day34_GarbageCollection_AccessModifier;

public class Constructor_Vs_StaticBlock {
    static {
        System.out.println("Static Block");
    }
    public Constructor_Vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
    }
}
