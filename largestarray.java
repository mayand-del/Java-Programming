public class largestarray {
    public static int greatest(int number[]){
        int Largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<number.length;i++){
            if(Largest<number[i]){
                Largest=number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("Smallest :"+smallest);
        return Largest;
    }
    public static void main(String args[]){
        int number[]={1,3,5,6,10,83};
        System.out.println("The largest number is :"+ greatest(number));
    }
    
}
