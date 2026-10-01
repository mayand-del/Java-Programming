public class duplicateleet {
    public static int findDuplicate(int number[]){
        for(int i=0;i<number.length-1;i++){
            for(int j=i+1;j<number.length;j++){
                if(number[i]==number[j]){
                    return number[i];
                }
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={3,1,3,4,2};
        System.out.println(findDuplicate(number));
    }
    
}
