public class sortinginser {
    public static void insertionSort(int arra[]){
        for(int i=1;i<arra.length;i++){
            int curr=arra[i];
            int prev=i-1;
            while (prev>=0 && arra[prev]>curr){//< decending
                arra[prev+1]=arra[prev];
                prev--;
            }
            //insertion sort
            arra[prev+1]=curr;
        }
    }
    public static void printarr(int arra[]){
        for(int i=0;i<arra.length;i++){
            System.out.print(arra[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arra[]={5,4,1,3,2};
        insertionSort(arra);
        //Arrays.sort(arra);
        //Arrays.sort(arra,0,5);

        printarr(arra);
    }
    
}
