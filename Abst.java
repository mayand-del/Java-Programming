public class Abst {
    public static void main(String args[]){
        Mustang mymust=new Mustang();

        // Horse h=new Horse();
        // h.eat();
        // h.walk();
        // Dog d=new Dog();
        // d.eat();
        // d.walk();
    }
    
}
abstract class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor");
    }
    void eat(){
        System.out.println("Eat");
    }
    abstract void walk();
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor");
    }
    void changeColor(){
        color="dark black";
    }
    void walk(){
        System.out.println("Run with 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor ");
    }
}
class Dog extends Animal{
    void walk(){
        System.out.println("Dog run with 4 legs");
    }
}
