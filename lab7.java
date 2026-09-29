import  java.io.FileNotFoundException;
class User{
    static int bal;
    static int temp=0;
    static int count;
    public User(int balance){
        bal=balance;
    }
    void deposite(int amount){
        bal=bal+amount;
    }
    void withdraw(int amount){
        temp=temp+amount;
        try{
            if(bal<1000){
                throw new ArithmeticException();
            }
            else if(amount>bal){
                throw new NullPointerException();
            }
            else if(count>=3){
                throw new ArrayIndexOutOfBoundsException();
            }else if(temp>100000){
               throw new FileNotFoundException();
            }
            else{
                bal=bal+amount;
                count++;
                System.out.println("Withdraw amount "+amount);
                System.out.println("your amount is withdraw"+bal);
            }
        }
        catch(ArithmeticException ee){
            System.out.println("Balance is below 1000 cant be withdraw ");
        }catch(NullPointerException e){
            System.out.println("Withdraw amount is greater than the amount");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Transcation count is exceed");
        }
        catch(FileNotFoundException e){
            System.out.println("One day 1 lakh limit exhaust");
        }
    }
    void check(){
        System.out.println(bal);
    }
}
public class lab7 {
    public static void main(String[] args){
        User ob=new User(2000);
        ob.deposite(7000);
        ob.withdraw(8500);
        ob.withdraw(100);
        ob.deposite(10000);
        ob.check();
        ob.withdraw(20000);
        ob.withdraw(300);
        ob.withdraw(80000);

    }
    
}
