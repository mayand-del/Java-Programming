import java.util.*;
public class funaveraj {
    public static int Average(int a,int b,int c){
        int averg=(a+b+c)/3;
        
        return averg;
    }
    public static void main(String args[]){
       try (Scanner sc=new Scanner(System.in)){
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=Average(a,b,c);
        System.out.println("Average of three number" +sum);

        }
    }
}
