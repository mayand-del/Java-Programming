import java.util.*;

public class usermultipleoften {
    public static void main(String[] args){
        // try(Scanner sc= new Scanner(System.in)){
        //     do { 
        //         System.out.print("Enter a number :");
        //         int n=sc.nextInt();
        //         if(n%10==0){
        //             break;
        //         }
        //         System.out.println(n);
        //     } while (true);
        // }
        //user except multiple by 10
        try(Scanner sc= new Scanner(System.in)){
            do { 
                System.out.print("Enter a number:");
                int n=sc.nextInt();
                if(n%10==0){
                    continue;
                }
                System.out.println("Number is :"+n);
            } while (true);
        } 
    }

    
}
