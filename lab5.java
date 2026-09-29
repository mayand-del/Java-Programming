abstract class Shapee{
    abstract void area();
    abstract void parameter();
}
class Rectangle extends Shapee{
    int l,b;
    public Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
        void area(){
            System.out.println("The area is "+(l*b));
        }
        void parameter(){
            System.out.println("The parameter is "+2*(l+b));

        }
}
class Squaree extends Shapee{
    int s;
    public Squaree(int s){
        this.s=s;
    }
    void area(){
        System.out.println("The area is" +(s*s));
    }
    void parameter(){
        System.out.println("The parameter is" +(4*s));
    }

}
public class lab5 {
    //Create a Abstract class and calculate the area of different shapes by overriding methods.17/03/2026
    public static void main(String[] args){
        Rectangle r=new Rectangle(5,8);
        r.area();
        r.parameter();
        Squaree s= new Squaree(3);
        s.area();
        s.parameter();

    }
}
