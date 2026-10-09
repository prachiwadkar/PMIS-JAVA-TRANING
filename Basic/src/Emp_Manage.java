class Empolyee {
    String name;
    double salary;

    Empolyee(String name , double salary){
        this.name = name;
        this.salary=salary;
    }
    void displayDetils(){
        System.out.println("Empolyee name is " + name );
        System.out.println("salary is " + salary);
    }
}
    class maneger extends Empolyee{

    String dept;

    maneger(String name , double salary , String dept){
        super(name , salary);
        this.dept = dept;
    }

        @Override
        void displayDetils() {
            super.displayDetils();
            System.out.println("Department is :- " +dept);
            System.out.println("Role is Manager");
        }
    }


public class Emp_Manage {
    static void main(String[] args) {

    maneger m = new maneger("prachi" , 800000 , "IT");
    m.displayDetils();
}
}