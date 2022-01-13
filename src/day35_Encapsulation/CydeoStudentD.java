package day35_Encapsulation;

public class CydeoStudentD {
    public String name, fieldOfStudy;  // instance variable because different for each student
    public char gender;  // instance variable because different for each student
    public int age;  // instance variable because different for each student
    public int batchNumber;  // instance variable because different for each student
    public int groupNumber;  // instance variable because different for each student
    public static String schoolName, programmingLanguage, secretCode;  // static variable because same for each student

    //set instances by constructor


    public CydeoStudentD(String name, String fieldOfStudy, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static {  // set static variables
        schoolName="CYDEO";
        programmingLanguage="JAVA";
        secretCode="WS";
        }
        public static void printSchoolName(){  // static method same for everyone
            System.out.println("School name "+schoolName);
        }
        public static void printSecretCode(){ // same for everyone
            System.out.println("code is "+secretCode);
        }
        public void attendClass(){ //instance method uses instance variables different names
            System.out.println(name+" is attending class ");
        }
        public void study(){ // instance method uses instance variables different names
        System.out.println(name+" is studying ");
    }

    public String toString() {
        return "CydeoStudentD{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", school name=" + schoolName + // static variable
                '}';
    }
}
