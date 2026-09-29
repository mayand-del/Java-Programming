import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class fileread {
    public static void main(String args[]){
        File myfile=new File("this.txt");
        try {
            Scanner sc=new Scanner(myfile);
            while(sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();


        }
    }
}
