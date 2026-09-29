import java.util.*;
public class week {
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
            int week=sc.nextInt();
            switch(week){
                case 1: System.out.println("Mondey");
                        break;
                case 2:System.out.println("Tuesday");
                       break;
                case 3: System.out.println("Wednesday");
                       break;
                case 4: System.out.println("Thrusday");
                       break;
                case 5: System.out.println("Friday");
                      break;
                case 6: System.out.println("Saturday");
                       break;
                case 7:System.out.println("Sunday");
                        break;
                default:System.out.println("Not exist in this week ");
            }
        }
    }
    
}
