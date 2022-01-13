package day34_GarbageCollection_AccessModifier;

public class QuizQuestion {
    public QuizQuestion(){
        System.out.println("A ");
    }
    public QuizQuestion(double a){
        this(2);
        System.out.println("B ");
    }
    public QuizQuestion(int c){
        this();
        System.out.println("C ");
        //this();
    }

    public static void main(String[] args) {
        QuizQuestion obj=new QuizQuestion(1.0);
    }
}
