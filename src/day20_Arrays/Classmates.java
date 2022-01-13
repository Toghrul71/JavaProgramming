package day20_Arrays;

public class Classmates {
    public static void main(String[] args) {
                            //  0            1            3            4            5
        String[] classMates= {"Koray B", "Nattaya A", "Cristina C", "Edrees S", "Gorkhmaz V",
                 // 6         7           8
                "Nazir M", "Selma S", "He Young"};

         // K.B, N.A, C.C

        for (int i = 0; i < classMates.length; i++) {
                        //      by writing [i] I recognize it as a string (example: Koray B)
            System.out.print(classMates[i].substring(0, 1)+"."+classMates[i].substring(classMates[i].indexOf(" ")+1, classMates[i].indexOf(" ")+2)+", "); // each index of array has 1 String.
                            //  String name: [i].

        }

        for (int i = 0; i < classMates.length; i++) {

            String name =classMates[i];
            System.out.print(name.substring(0, 1)+"."+name.substring(name.indexOf(" ")+1, name.indexOf(" ")+2)+", ");
        }



    }

    }

