/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package off;

import java.util.Scanner;

/**
 *
 * @author User
 */


public class Off {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EnemyFactory shipfactory=new EnemyFactory();
        EnemyShip theEnemy=null;
        Scanner scn=new Scanner(System.in);
        System.out.println("What type of ship?(U /R /B)");
        if (scn.hasNextLine()){
            String typeofship=scn.nextLine();
            theEnemy=shipfactory.makeEnemyShip(typeofship);
            
        }
        if (theEnemy!=null){
        doStuffEnemy(theEnemy); 
        }
        else{
            System.out.println("Enter a U,R or B next Time");
        }
    }
    public static void doStuffEnemy(EnemyShip anEnemyship){
        anEnemyship.displayenemyship();
        anEnemyship.followheroship();
        anEnemyship.dodamage();
    }
    
}
