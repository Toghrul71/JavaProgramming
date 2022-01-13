package day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1=new Employee("Toghrul", 'L', 36,120000);
        System.out.println(employee1);
        System.out.println(employee1.getName());

        employee1.setAge(32);
        System.out.println(employee1);

        Employee employee2=new Employee("M",'M',25,210000);
        System.out.println(employee2);
        employee2.setSalary(employee2.getSalary()+5000);
        System.out.println(employee2);
    }
}
