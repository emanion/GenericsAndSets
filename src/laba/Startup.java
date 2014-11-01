
package laba;

import java.util.*;

/**
 *
 * @author emanion
 */
public class Startup {
    
    public static void main(String[] args) {
        
       List battleShips = new ArrayList();
       
       battleShips.add(new BattleShip("Prince of Whales",4));
       battleShips.add(new BattleShip("Prince Eugen", 6));
       battleShips.add(new BattleShip("Arizona",6));
       battleShips.add(new BattleShip("Yamato",8));
       battleShips.add(new BattleShip("Bismark",8));
       battleShips.add(new Destroyer("Nimitz",12));
       
       
       //objects below are being treated polymorphically
       //because they all have a toString method
       for(int i=0;i < battleShips.size();i++){
           System.out.println(battleShips.get(i));
       }
       
       
       
        
        
       List<BattleShip> battleShips2 = new ArrayList<>();
       
       battleShips2.add(new BattleShip("Prince of Whales",4));
       battleShips2.add(new BattleShip("Prince Eugen", 6));
       battleShips2.add(new BattleShip("Arizona",6));
       battleShips2.add(new BattleShip("Yamato",8));
       battleShips2.add(new BattleShip("Bismark",8));
       //battleShips2.add(new Destroyer("Nimitz",12));   //error on line
       
       for(BattleShip battleShip:battleShips2){
           System.out.println(battleShip.toString());
       }
        
        
        
    }
    
}
