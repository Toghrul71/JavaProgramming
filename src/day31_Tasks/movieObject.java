package day31_Tasks;

public class movieObject {
    public static void main(String[] args) {
        Movie movie1=new Movie("Canada","Journey to SDET :Cydeo Batch 23","10.25.2021","Kuzzat Altay");
        movie1.addCast("Olga");
        //String[] casts={"Asiya", "Adam", "Muhtar"};
        movie1.addCasts(new String[]{"Asiya", "Adam", "Muhtar"});
        System.out.println(movie1);
    }
}
