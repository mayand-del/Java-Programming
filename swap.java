public class swap {
    public static void Swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a);
        System.out.print("b="+b);

    }

    public static void main(String[] args){
        int a=7;
        int b=8;
        Swap(a,b);
    }
    
}
