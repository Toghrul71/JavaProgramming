package day23_Tasks;

public class VoteEligibility {
    public static void main(String[] args) {

            eligibleToVote(20,"usa");
    }
    public static void eligibleToVote(int age, String citizenship){

        if(age>=18 && citizenship.equalsIgnoreCase("USA")){
            System.out.println("You are eligible to vote!");
        }else {
            System.out.println("You are not eligible to vote!");
        }


    }
}
