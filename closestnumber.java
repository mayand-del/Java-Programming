public class closestnumber {
    public static int divisible(int n,int m){
        int closest=0;
        int mindiffrence=Integer.MAX_VALUE;
        for(int i=n-Math.abs(m);i<=n+Math.abs(m);i++){
            if(i%m==0){
                int diffrence=Math.abs(n-i);
                if(diffrence<mindiffrence||(diffrence==mindiffrence && Math.abs(i)>Math.abs(closest))){
                    closest=i;
                    mindiffrence=diffrence;
                }
            }
        }
        return closest;
    }
    public static void main(String args[]){
        int n=13,m=4;
        System.out.print(divisible(n, m));

    }
    
}
