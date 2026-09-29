public class patterhollo {
    public static void hollow_rectangle(int totRow,int totCols){
        //outer loop rowa
        for(int i=1;i<=totRow;i++){
            // iner loop is colum
            for(int j=1;j<=totCols;j++){
                if(i==1||i==totRow||j==1||j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
    public static void main(String args[]){
        hollow_rectangle(4,5);
    }
    
}
