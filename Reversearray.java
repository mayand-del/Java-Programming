public class Reversearray {
    public static int reverseSearch(int number[]){
        int first=0,last=number.length-1;
        while(first<last){
            int temp=number[last];
            number[last]=number[first];
            number[first]=temp;
            first++;
            last--;
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={2,4,5,6,7,10};
        reverseSearch(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();

    }
}
