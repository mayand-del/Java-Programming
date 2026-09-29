import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fliewite {
    public static void main(String args[]){
        File myfile=new File("this.txt");
        try {
            FileWriter filewrite= new FileWriter("this.txt");
            filewrite.write("This a boy");
            filewrite.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
