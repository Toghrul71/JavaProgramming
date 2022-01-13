package day35_Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1=new Employee();
        employee1.setName("John");
        employee1.setSalary(120000);

        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());
        
    }
}
