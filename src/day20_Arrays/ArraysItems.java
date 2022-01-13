package day20_Arrays;

public class ArraysItems {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "AirPods", "iPad", "iPhone 12 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};



        int indexNumber = -1;


        for (int i = 0; i < items.length; i++) {

            if (items[i].equals("Gloves")) {

                indexNumber = i;

            }


        }
        System.out.println("Index number for 'Gloves' is: " + indexNumber);


        boolean hasIpad = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equals("iPad")) {

                hasIpad = true;

            }



        }

        System.out.println("List has 'iPad' " + hasIpad);

        String itemList= "";
        for (int i = 0; i < items.length; i++) {
            itemList+= items[i] +"-"+prices[i]+"$-"+ "#"+itemIDs[i]+", ";

        }

        System.out.println("Item list: "+itemList);


    }
}
