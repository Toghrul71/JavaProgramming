package day39_Recap.shapeTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null){
            System.out.println("Name can not be null");
            System.exit(0); // 0 means program terminated with 0 code- no errors, 1 means unexpected error
        }
        if(name.isEmpty() || name.isBlank()){
            System.out.println("Invalid name");
            System.exit(1); // 1 means something went wrong
        }
        this.name = name;
    }
    //___________ new class
    public Shape(String name){
      setName(name);
    }
    public double area(){
      return 0;                       // this method must have a body
    }
    public double perimeter(){
        return 0;
    }
}
