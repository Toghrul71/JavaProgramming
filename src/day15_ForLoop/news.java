package day15_ForLoop;

public class news {
    public static void main(String[] args) {
        float f1 = (12_345.1>123_45.0)?12_456:124_56.02f;
        float f2=f1+1024;
        System.out.println(f2);


        System.out.println("------------------------");

        int z = 10;
        switch (z){
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            default:
                System.out.println("Friday");
        }
    }
}
