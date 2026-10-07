public class diagonalmatrix {
    public static int Diagonalmatri(int matrixx[][]){
        int sum=0;
        //for(int i=0;i<matrixx.length;i++){
          //  for(int j=0;j<matrixx[0].length;j++){
               // if(i==j){
               //     sum+=matrixx[i][j];
               // }
               // else if (i+j== matrixx.length-1) {
                //    sum+=matrixx[i][j];
               // }
           // }
       // }
       for(int i=0;i<matrixx.length;i++){
        sum+=matrixx[i][i];
        if(i !=matrixx.length-i-1){
            sum+=matrixx[i][matrixx.length-1-i];
        }
       }
        return sum;
    }
    public static void main(String args[]){
        int matrixx[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(Diagonalmatri(matrixx));
    }
}
