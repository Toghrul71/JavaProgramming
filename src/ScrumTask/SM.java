package ScrumTask;

public class SM extends Employee{
    public String titleOfSM;

    public SM(String name, int age, char gender, int ID, String jobTitle, double salary, String titleOfSM) {
        super(name, age, gender, ID, jobTitle, salary);
        this.titleOfSM = titleOfSM;
    }
    public void titleOfSM(){
        System.out.println("Title of SM is: "+titleOfSM);
    }
}
