public class recfibbonaci {
    public static int printFibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1=printFibbo(n-1);
        int fnm2=printFibbo(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println(printFibbo(n));
    }
}
