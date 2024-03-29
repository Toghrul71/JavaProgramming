package day21_forEachLoop;

public class indexNumberIfGloves {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int indexNumber=-1;
        boolean hasIpad=false;

        for (int i = 0; i < items.length; i++) {
            String item=items[i];
            double price=prices[i];
            int ID = itemIDs[i];

            if(items[i].equals("Gloves")){
                indexNumber=i;
            }
            if(items[i].equals("iPad")){
                hasIpad = true;
            }
            System.out.println(item+"-"+price+"-"+"#"+ID);
        }
        System.out.println(indexNumber);
        System.out.println(hasIpad);

    }
}
