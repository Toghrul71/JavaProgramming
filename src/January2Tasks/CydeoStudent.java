package January2Tasks;

public class CydeoStudent {
        public String name;  // instance variable
        public int age;
        public char gender;
        public int ID;
        public char grade;
        public int batchNumber;
        public int groupNumber;
        public static String schoolName="CYDEO";  // static variabe
        public static String programmingLanguage="Java";

        public CydeoStudent(String name, int age, char gender, int ID, char grade, int batchNumber, int groupNumber) {
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.ID = ID;
                this.grade = grade;
                this.batchNumber = batchNumber;
                this.groupNumber = groupNumber;
        }

        public String toString() {
                return "CydeoStudent{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        ", gender=" + gender +
                        ", ID=" + ID +
                        ", grade=" + grade +
                        ", batchNumber=" + batchNumber +
                        ", groupNumber=" + groupNumber +
                        ", schoolName=" + schoolName +
                        ", programmingLanguage=" + programmingLanguage +
                        '}';
        }
        public void study(String name){
                System.out.println(name+"studies");
        }
        public void attendClass(String name){
                System.out.println(name+"attends class");
        }

}
