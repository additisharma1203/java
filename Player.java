// class Player{
//     String name;
//     int playerId;
//     String sports;
//     int score;
//     static int playerCount;
//     Player(String n,int id){
//         name=n;
//         playerId=id;
//         sports="unknown";
//         score=0;
//         playerCount++;
//     }
//     Player(String n,int id,String s){
//         this(n,id);
//         sports=s;
//     }
//     Player(String n,int id,String s,int sc){
//         this(n,id,s);
//         score=sc;
//     }
//     void updateScore(int score){
//         this.score=score;
//     }
//     void updateScore(int score,int bonus){
//         this.score=score+bonus;
//     }
//     @Override public String toString(){
//         return "Player{name='"+name+"',id="+playerId+", sport='"+sports+"', score="+score+"}";
//     }

// }

// public class PlayerStatics {
//     public static void main(String[] arg){
//         Player p1=new Player("abc",21);
//         Player p2=new Player("cde",22,"djhms");
//         Player p3=new Player("bbb",33,"dfd",12);
//         p1.updateScore(80);
//         p2.updateScore(90,10);
//         System.out.println(p1);
//         System.out.println(p2);
//         System.out.println(p3);
//         System.out.println("Total player: "+Player.playerCount);
//     }
// }





import java.util.Scanner;
class Play{
    String name,sport;
    int id,score;
    static int playerCount=0;
    Play(){
        name="unknown";
        id=0;
        sport="u";
        score=0;
        playerCount++;
    }
    Play(String name,int id){
        this();
        this.name=name;
        this.id=id;
    }
    Play(String name,int id,String sport){
        this(name,id);
        this.sport=sport;
    }
    Play(String name,int id,String sport,int score){
        this(name,id,sport);
        this.score=score;
    }
    void updateScore(int score){
        this.score=score;
    }
    void updateScore(int score,int bonus){
        this.score=score+bonus;
    }
    @Override public String toString(){
        return "Player{name='"+name+"', id="+id+", sport='"+sport+"', score="+score+"}";
    }
}

public class Player{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-->0){
            sc.nextLine();
        String name=sc.nextLine();
        int id=sc.nextInt();
        int score=sc.nextInt();
        // sc.nextLine();
        String sport=sc.next();
        // sc.nextLine();
        // String name=sc.nextLine();
        Play p1=new Play(name,id);
        System.out.println(p1.toString()+"\n");
        Play p2=new Play(name,id,sport);
        p2.updateScore(129999);
         System.out.println(p2.toString()+"\n");
        Play p3=new Play(name,id,sport,score);
        p3.updateScore(11232,123);
         System.out.println(p3.toString()+"\n");
        }

    }
}
