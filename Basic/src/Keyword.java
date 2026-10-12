class Student{
    String name;
    static String clg = "IIT Bombay";
    Student(String name){
        this.name = name;
    }
    void stucol(){
        System.out.println(name + " studies in " + clg);
    }
}

public class Keyword {
    public static void main(String[] args) {
        Student s = new Student("prachi");
        s.stucol();

    }
}
