package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {


        // 4 testers objects
        Tester tester1 = new Tester("Tony", 14, "QA", 105000);
        Tester tester2 = new Tester("Good", 15, "SDET", 155000);
        Tester tester3 = new Tester("To", 16, "SE", 125000);
        Tester tester4 = new Tester("Toy", 17, "QA", 115000);
        Tester[] testers={tester2,tester3,tester4};
        // 5 developers objects
        Developer developer1 = new Developer("Yon", 20, "Java Developer", 185000);
        Developer developer2 = new Developer("Yni", 21, "Java Master", 165000);
        Developer developer3 = new Developer("Tnon", 22, "Software Developer", 135000);
        Developer developer4 = new Developer("Ryon", 23, "Javascript Developer", 285000);


        Developer[] developers={developer2, developer3, developer4};

        //1 ScrumTeam Object
        ScrumTeam scrum = new ScrumTeam("John", "Good", "Tony", 5);

        scrum.addTester(tester1);
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        for (Tester eachTester : scrum.testersList) {
            System.out.println(eachTester.name+" : "+ eachTester.salary);
            }
        System.out.println("------------------------------------------------");
        for (Developer eachDeveloper : scrum.devopsList) {
            System.out.println(eachDeveloper.name+" : "+eachDeveloper.salary);
        }
        System.out.println("---------");
        scrum.removeTester(23);
        scrum.removeDeveloper(22);
        System.out.println(scrum);

    }
}

/*
1. Create an array of Testers and add the testers from your group
2. Create an array of developers add the developers from your group
3.
 */
