import java.util.*;
public class sumofevenandodd {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
            int number;
            int choice;
            int evenSum=0;
            int oddSum=0;
            do { 
                System.out.println("Enter a number:");
                number=sc.nextInt();
                if(number%2==0){
                    evenSum+=number;
                }else{
                    oddSum+=number;
                }
                System.out.println("Do you want to continuo? press 1 is yes or 0 is not");
                choice= sc.nextInt();

            } while (choice==1);
            System.out.println("Sum of the number:"+evenSum);
            System.out.println("Sum of the number:"+oddSum);
        }
    }
    
}
