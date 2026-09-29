public class Methodoverridin {
    public static void main(String args[]){
        Deer dee=new Deer();
        dee.eat();
    }
    
}
class Animal{
    void eat(){
        System.out.println("Eat grass");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Ear food ");
    }
}
