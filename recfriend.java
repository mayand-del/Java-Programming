public class recfriend {
    public static int Friendpairing(int n){
        if(n==0 || n==1){
            return n;
        }
        //long way
        // int fnm1=Friendpairing(n-1);
        // int fnm2=Friendpairing(n-2);

        // int pairways=(n-1)*fnm2;
        // int totalways=fnm1+pairways;
        // return totalways;
        //easy way
        return Friendpairing(n-1)+(n-1)*Friendpairing(n-2);
    }
    public static void main(String args[]){
        System.out.println(Friendpairing(3));


    }
}
