
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jovau
 */
public class PAssign5 {

    public static void main(String[] args) {
        //Instantiate characters here
        CharacterType w1 = new Warrior();
        CharacterType m1 = new Mage();
        CharacterType n1 = new Necromancer();
        CharacterType g1 = new Guardian();
        
        System.out.println(w1.toString());

//        //Collect all characters into a collection
//        ArrayList<CharacterType> Party = new ArrayList<>();
//        Party.add(w1);
//        Party.add(m1);
//        Party.add(n1);
//        Party.add(g1);
//
//        //Boss health and level
//        int bossHealth = 3200;
//        int bossLevel = 300;
//
//        //find total party health and level and print character info
//        int partyHealth = 0;
//        int partyLevel = 0;
//        for (CharacterType characters : Party) {
//            partyHealth += characters.getHealthPool();
//            partyLevel += characters.getLevel();
//            characters.toString();
//        }
//        
//       //search for instance of a warrior class
//       boolean warCheck = false;
//       for (CharacterType characters : Party){
//          if(characters instanceof Warrior)
//          {
//              warCheck = true;
//          }
//       }       
//       boolean SSCheck = false;


    }

} //end PAssign5 class

class CharacterType {

    //Data Fields
    private String name;
    private int level;
    private int healthPool;
    SpecialSkill specialSkill;

    //Constructors
    public CharacterType() {
        this.name = "Frodo Jones";
        this.level = 0;
        this.healthPool = 0;
    }

    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealthPool() {
        return healthPool;
    }

    public void setHealthPool(int healthPool) {
        this.healthPool = healthPool;
    }

    public SpecialSkill getSpecialSkill() {
        return specialSkill;
    }

    public void setSpecialSkill(SpecialSkill specialSkill) {
        this.specialSkill = specialSkill;
    }

    @Override
    public String toString() {
        return this.getName() + "Char, " + "Level " + this.getLevel() + ", " + getHealthPool() + "HP"
            + this.specialSkill.toString();
    }
}

class SpecialSkill {

    private String name;
    private int cooldown;

    public SpecialSkill() {
        this.name = "";
        this.cooldown = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    @Override
    public String toString() {
        return "/n Special Skill: " + this.getName() + " (" + this.getCooldown() + ")";
    }

}

class Warrior extends CharacterType {

    private int rage;
    
    public Warrior() {
        super();
        SpecialSkill ssWar = new SpecialSkill();
        ssWar.setCooldown(180);
        ssWar.setName("Fury");
        super.setName("Warrior Char");
        super.setLevel(100);
        super.setHealthPool(900);
        setRage(95);

    }

    public int getRage() {
        return rage;
    }

    public void setRage(int rage) {
        this.rage = rage;
    }

    @Override
    public String toString() {
        return super.toString() ; //To change body of generated methods, choose Tools | Templates.
    }

}

class Guardian extends CharacterType {

    private int healingPower;

    public Guardian() {
        SpecialSkill ssGuard = new SpecialSkill();
        ssGuard.setName("Protection");
        ssGuard.setCooldown(90);
        super.setName("Guardian Char");
        super.setLevel(100);
        super.setHealthPool(1000);
        setHealingPower(90);

    }

    public int getHealingPower() {
        return healingPower;
    }

    public  void setHealingPower(int healingPower) {
        
    }
}

class Mage extends CharacterType {

    private int mana;

    public Mage() {
        SpecialSkill ssMage = new SpecialSkill();
        ssMage.setName("Fire Storm");
        ssMage.setCooldown(120);
        super.setName("Mage Char");
        super.setLevel(100);
        super.setHealthPool(800);
        setMana(100);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return super.toString();
    }
        
}

class Necromancer extends CharacterType {

    private int lifeForce;

    public Necromancer() {
        SpecialSkill ssNecro = new SpecialSkill();
        ssNecro.setName("Death Magic");
        ssNecro.setCooldown(60);
        super.setName("Necromance Char");
        super.setLevel(100);
        super.setHealthPool(850);
        setLifeForce(15);

    }

    public int getLifeForce() {
        return lifeForce;
    }

    public void setLifeForce(int lifeForce) {
        this.lifeForce = lifeForce;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
