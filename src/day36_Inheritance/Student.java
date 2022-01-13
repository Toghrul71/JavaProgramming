package day36_Inheritance;

public class Student {
    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;
    private boolean isStudent=true;

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){  // instance method

        this.name=name;
    }
    public void setAge(int age){   // instance method
        if(age>=5 && age<=90){
            this.age=age;
        }else {
            System.out.println("Invalid entry: "+age);
            System.exit(0);
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender=='M' || gender=='F'){
            this.gender = gender;
        }else {
            System.out.println("Invalid entry: "+gender);
            System.exit(0);
        }

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if(grade=='A'||grade=='B'|| grade=='C'|| grade=='D'|| grade=='F'){
            this.grade = grade;
        }else {
            System.out.println("Invalid entry: "+grade);
        }

    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void study(String name){
        System.out.println(name+" studies");
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String toString() {
        return "encapsulation{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", is student=" + isStudent +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

}
