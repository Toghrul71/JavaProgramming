public class December19Replit2 {
    public static void main(String[] args) {
        timeConversion("07:05:19PM");

    }
    public static void timeConversion(String s){

        if(s.toLowerCase().endsWith("am")){
            System.out.println(s.substring(0, s.length()-2));
        }else if (s.toLowerCase().endsWith("pm")){
            String[] array = s.split(":");
            array[0]=Integer.parseInt(array[0])+12+"";
            System.out.println(array[0]+":"+array[1]+":"+array[2].substring(0,2));
        }

    }
}
