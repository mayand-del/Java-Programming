import java.io.File;
import java.io.IOException;

public class fliecreate {
    public static void main(String args[]){
        //create file 
        File myfile= new File("this.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable tp create this file");
            e.printStackTrace();
        }
    }
}
