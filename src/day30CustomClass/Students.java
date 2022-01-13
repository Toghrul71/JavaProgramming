package day30CustomClass;

public class Students {
    public String name; // instance
    public int age;
    public String gender;
    public char grade;


    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", grade=" + grade +
                '}';
    }

    public void setInfo(String name, int age, String gender, char grade) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
    }

    public void likes(){
        System.out.println(name+" likes pizza");
    }
    public void learns(){
        System.out.println(name+" learns Java");
    }
}
