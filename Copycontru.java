public class Copycontru {
    public static void main(String args[]){
        Student s1=new Student();
        s1.name="Mayand";
        s1.roll=983;
        s1.password="ndn";
        s1.marks[0]=90;
        s1.marks[1]=84;
        s1.marks[2]=89;
        Student s2=new Student(s1);
        s2.password="kjndfj";
        s1.marks[2]=98;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }

    }
    
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];
    // Student(Student s1){//shallow cpy constructor
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }
    Student(Student s1){//deep copy
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    Student(){
        marks=new int[3];
        System.out.println("Non-parametaraized constructor");
    }
    Student(String name){
        marks=new int[3];
        this.name=name;
    }
    Student(int roll){
        marks=new int[3];
        this.roll=roll;
    }



}