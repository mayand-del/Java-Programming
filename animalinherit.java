public class animalinherit {
    public static void main(String args[]){
        Fish dobby=new Fish();
        dobby.eat();
    }
    
}
//Base class
class Animal{
    String color;
    void breath(){
        System.out.println("breadth");
    }
    void eat(){
        System.out.println("eat");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Walk");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Fly");
    }
}
//Multi level 
// class Dog extends Mammal{
//     String breed;
// }
//Derived class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swim ");
//     }

// }
