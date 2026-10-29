public class recpow {
    public static int printPower(int x,int n){
        if(n==0){
            return 1;
        }
        // int xnm1=printPower(x,n-1);
        // int xn=x*xnm1;
        // return xn;

        return x*printPower(x, n-1);
    }
    public static void main(String args[]){
        System.out.println(printPower(2, 5));

    }
}
