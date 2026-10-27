public class rectili {
    public static int TilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //kaam

        //vartical choice
        int fnm1=TilingProblem(n-1);
        //horizontal choice
        int fnm2=TilingProblem(n-2);

        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void main(String args[]){
        System.out.println(TilingProblem(4));
    }
}
