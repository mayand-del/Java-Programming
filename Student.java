public class Student {
    Student(){
        this(101);
        System.out.println("Default constructor");
    }
    Student(int id){
        this(101,"Ravi");
        System.out.println("Id="+id);
    }
    Student(int id,String name){
        System.out.println(id+" "+name);
    }
    public static void main(String args[]){
        Student s=new Student();
    }
    
}
