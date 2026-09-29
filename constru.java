public class constru {
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student("Mayand");
        Student s3=new Student(98);
    }
    
}
class Student{
    String name;
    int roll;
    Student(){
        System.out.println("Non- parametrized constructor");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
