import java.util.*;
public class costofprice {
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float total=pencil+pen+eraser;
        System.out.println(total);
        }
    }
}
