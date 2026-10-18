public class bitmanipulationodd {
    public static void OddandEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String args[]){
        OddandEven(4);
        OddandEven(11);
        OddandEven(14);
    }
    
}
