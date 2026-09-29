public class inter {
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
    }
}
interface Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,right,left,diagonal(4 dirct)");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,righ,left,diagonal(all direct)");
    }

}
