package utilities;

import day33_Statics.Employee;
import day34_GarbageCollection_AccessModifier.AccessModifiers;

public class AccessModifiersTest {
    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData);
       AccessModifiers.method1();
       AccessModifiers.method1();

        System.out.println(Employee.companyName );

    }
}
