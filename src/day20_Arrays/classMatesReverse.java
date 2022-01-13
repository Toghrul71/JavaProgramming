package day20_Arrays;

public class classMatesReverse {
    public static void main(String[] args) {

        String[] classMates = {"Koray B", "Nattaya A", "Cristina C", "Edrees S",
                "Gorkhmaz V", "Nazir M", "Selma S", "He Young"};


        for (int i = 0; i < classMates.length; i++) {
            String reversed = "";

            for (int j = classMates[i].length(); j > 0; j--) {


                reversed += "" + classMates[i].charAt(j-1);




            }
            System.out.println(reversed);
        }

    }
}


//for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i]+" ");
//        }