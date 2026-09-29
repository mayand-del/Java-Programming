import java.util.*;
public class digitfun {
    public static int Sumofdigit(int n){
        int sumofdigit=0;
        while(n>0){
            int lastdigit=n%10;
            sumofdigit+=lastdigit;
            n/=10;
        }
        return sumofdigit;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int digit=sc.nextInt();
        System.out.println("The number is "+Sumofdigit(digit));
    }
}
