package day35_Encapsulation;

public class cydeoStudent {
    public String name, fieldOfStudy;
    public char gender;
    public int age, batchNumber, groupNumber, secretCode;
    public static String schoolName, programmingLanguage;

    public cydeoStudent(String name, String fieldOfStudy, char gender, int age, int batchNumber, int groupNumber, int secretCode) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.secretCode = secretCode;

        }
        static {
        schoolName="Cydeo";
        programmingLanguage="Java";
        }
        public static void printSchoolName(){
            System.out.println("School name is: "+schoolName);
        }
        public void printSecredCode(){
            System.out.println("Secret code is: "+secretCode);
        }
        public void attendClass(){
            System.out.println(name+" attends class");
        }
        public void study(){
            System.out.println(name+" study");
        }

    public String toString() {
        return "cydeoStudent{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", secretCode=" + secretCode +
                '}';
    }
}
