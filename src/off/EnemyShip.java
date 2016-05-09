/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package off;

/**
 *
 * @author User
 */
public abstract class EnemyShip{
    private String name;
    private double Amtdamage;
    
    public String getname(){
        return name;
    }
    public double getdamage(){
        return Amtdamage;
    }
    public void setname(String newname){
        name=newname;
    }
    public void setdamage(double a){
        Amtdamage=a;
    }
    public void followheroship(){
        System.out.println(getname()+" is following the hero");
    }
    public void displayenemyship(){
        System.out.println(getname()+" is on the screen");
    }
    public void dodamage(){
        System.out.println(getname()+" attacks and does damage "+getdamage());
    }
}