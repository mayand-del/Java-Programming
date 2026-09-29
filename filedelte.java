import java.io.File;

public class filedelte {
    public static void main(String args[]){
        File myfile=new File("this.txt");
        if(myfile.delete()){
            System.out.println("I have delete"+myfile.getName());
        }else{
            System.out.println("System has some people");
        }
    }
}
