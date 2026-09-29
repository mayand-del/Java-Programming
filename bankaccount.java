public class bankaccount {
    public static void main(String args[]){
        Bankaccount myAcc=new Bankaccount();
        myAcc.name="Mayand";
        myAcc.setpassword("kjdfks");
    }
    
}
class Bankaccount{
    public String name;
    private String password;
    public void setpassword(String pwd){
        password=pwd;
    }


}