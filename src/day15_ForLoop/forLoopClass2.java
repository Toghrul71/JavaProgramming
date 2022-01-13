package day15_ForLoop;

public class forLoopClass2 {
    public static void main(String[] args) {
        for (char upperCaseLetter = 'A'; upperCaseLetter <= 'Z'; upperCaseLetter++) {
            System.out.print(upperCaseLetter + " ");
        }

        System.out.println("");
        for (char lowerCaseLetter = 'a'; lowerCaseLetter <= 'z'; lowerCaseLetter++) {
            System.out.print(lowerCaseLetter + " ");
        }
        System.out.println("");
        for (char zToA = 'Z'; zToA >= 'A'; zToA--) {
            System.out.print(zToA + " ");
        }
        System.out.println("");
        for (char zToA = 'z'; zToA >= 'a'; zToA--) {
            System.out.print(zToA + " ");
        }
        System.out.println("");
        for(char i = 1; i<=40000; i++){
            System.out.print(i+" ");
        }
    }
}
