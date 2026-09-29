public class linear {
    public static int Searchindex(int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int number[]={2,4,7,8,10,20,200};
        int key=20;
        int index=Searchindex(number,key);
        if(index==-1){
            System.out.println("Not found");
        }else{
            System.out.println("Key is "+ index);
        }
    }
    
}
