package day37_Inheritance.AnimalTask;
class A{
    public A(int a){
        System.out.println("A");
    }
}
class B extends A { // is parent class doesnt have argument in constructor then super is by default in child class
    public B(){
        super(9);
        System.out.println("B");
    }
        }
public class ConstructorPractice {
    public static void main(String[] args) {
        B obj=new B();
    }
}
