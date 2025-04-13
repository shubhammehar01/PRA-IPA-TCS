import java.util.*;

public class Main {
    static int findPointsForGivenSkill(ArrayList<Player> player,String str){
      
      int res = 0;
      for(Player p : player){
        if(p.skill.equals(str)){
          res += p.point;
        }
      }
      return res;
    }
    static Player getPlayerBasedOnLevel(ArrayList<Player> player,String level,String skill){
      
      Player res = null;
      for(Player p : player){
        if(p.point > 20 && (p.level.equals(level) && p.skill.equals(skill))){
          return res = p;
        }
        
      }
      return null;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Hello world!");
      ArrayList<Player> player = new ArrayList<>();
      
      for(int i=0; i<4; i++){
        int id = sc.nextInt();sc.nextLine();
        String skill = sc.nextLine();
        String level = sc.nextLine();
        int point = sc.nextInt();
        Player p = new Player(id,skill,level,point);
        player.add(p);
        
      }
      sc.nextLine();
      String skill = sc.nextLine();
      System.out.println(findPointsForGivenSkill(player,skill));
      String level = sc.nextLine();
      Player obj = getPlayerBasedOnLevel(player,level,skill);
      System.out.println(obj.playerId);
      
      
      
  }
}
class Player{
  int playerId;
  String skill;
  String level;
  int point;
  
  Player(int id,String skill,String level,int point){
    this.playerId = id;
    this.skill = skill;
    this.level = level;
    this.point = point;
  }
}
