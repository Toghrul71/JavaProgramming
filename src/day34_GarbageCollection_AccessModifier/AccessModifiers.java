package day34_GarbageCollection_AccessModifier;

public class AccessModifiers {
    public static int publicData=100; // access modifier is public// is always visible to all packages
    static int defaultData=200;// // access modifier is default//visible to all classes inside this package
    private static int privateData=300;//  access modifier is private

    public static void method1(){
        System.out.println("Public");
    }
    static void method2(){
        System.out.println("Default");
    }
    private static void method3(){
        System.out.println("Private");
    }
    public static void main(String[] args) {
        System.out.println(privateData);
        System.out.println(defaultData);
        System.out.println(publicData);


    }
}
