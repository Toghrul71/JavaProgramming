package ScrumTask;

public class PO extends Employee {
    public String scrumBacklogMethod;

    public PO(String name, int age, char gender, int ID, String jobTitle, double salary, String scrumBacklogMethod) {
        super(name, age, gender, ID, jobTitle, salary);
        this.scrumBacklogMethod = scrumBacklogMethod;
    }
    public void scrumBacklog(){
        System.out.println(name+" is using "+scrumBacklogMethod);
    }
}
