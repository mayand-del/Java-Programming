public class recBinary {
    public static void printBinstrin(int n, int lastdigit,String str){
        if(n==0){
            System.out.println(str);
            return;
        }

        printBinstrin(n-1, 0, str+"0");
        if(lastdigit==0){
            printBinstrin(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]){
        printBinstrin(3, 0, "");
    }
}
