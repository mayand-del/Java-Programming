import java.util.*;

public class countcharacter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        System.out.println("Enter a char:");
        char ch=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
            System.out.println("Occurence="+count);
        }
    }
}
