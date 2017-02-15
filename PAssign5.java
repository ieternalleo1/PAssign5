
import java.util.ArrayList;

/**
 * File: assignments/PAssign2.java
 * Course: CSCI 1302
 * Author: Jovaun McGregor
 * Created on: Feb 11, 2017
 * Last Modified: Feb 14, 2017
 * Description: Create character type mockups and test default value for a boss
 * encounter
 */

public class PAssign5 {

    public static void main(String[] args) {
        //Instantiate characters here
        CharacterType w1 = new Warrior();
        CharacterType m1 = new Mage();
        CharacterType n1 = new Necromancer();
        CharacterType g1 = new Guardian();
        
//        w1.setHealthPool(50);


        //Collect all characters into a collection
        ArrayList<CharacterType> Party = new ArrayList<>();
        Party.add(w1);
        Party.add(g1);
        Party.add(m1);
        Party.add(n1);

        //Boss health and level
        int bossHealth = 3200;
        int bossLevel = 300;

        //find total party health and level and print character info
        int partyHealth = 0;
        int partyLevel = 0;
        for (CharacterType characters : Party) {
            partyHealth += characters.getHealthPool();
            partyLevel += characters.getLevel();
            System.out.println(characters.toString() + "\n");
        }

        //search for instance of a warrior class
        boolean warCheck = false;
        for (CharacterType characters : Party) {
            if (characters instanceof Warrior) {
                warCheck = true;
            }
        }
        
        //search for SpecialSkill Fire Storm
        boolean ssCheck = false;
        for (CharacterType characters : Party) {
            if (characters.getSpecialSkill().getName().equals("Fire Storm")) {
                ssCheck = true;
            }
        }
        System.out.println("Total HP: " + partyHealth);
        System.out.println("Total Level: " + partyLevel);
        if (partyHealth >= bossHealth && partyLevel >= bossLevel &&  warCheck == true && ssCheck == true){
            System.out.println("Party is eligible for Boss");
        }
        else
            System.out.println("Party is ineligible for Boss");
    }
} //end PAssign5 class

class CharacterType {

    //Data Fields
    private String name;
    private int level;
    private int healthPool;
    SpecialSkill specialSkill = new SpecialSkill();

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
        return this.getName() + ", " + "Level " + this.getLevel() + ", " + getHealthPool() + "HP";
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
        return "\nSpecial Skill: " + this.getName() + " (" + this.getCooldown() + "s)";
    }

}

class Warrior extends CharacterType {

    private int rage;

    public Warrior() {
        super();
        specialSkill.setCooldown(180);
        specialSkill.setName("Fury");
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
        return super.toString() + specialSkill.toString() + "\nRage: " + this.getRage(); //To change body of generated methods, choose Tools | Templates.
    }

}

class Guardian extends CharacterType {

    private int healingPower;
   

    public Guardian() {
        specialSkill.setName("Protection");
        specialSkill.setCooldown(90);
        super.setName("Guardian Char");
        super.setLevel(100);
        super.setHealthPool(1000);
        setHealingPower(90);

    }

    public int getHealingPower() {
        return healingPower;
    }

    public void setHealingPower(int healingPower) {
        this.healingPower = healingPower;
    }

    @Override
    public String toString() {
        return super.toString() + specialSkill.toString() + "\nHealing Power: " + this.getHealingPower(); //To change body of generated methods, choose Tools | Templates.
    }
}

class Mage extends CharacterType {

    private int mana;

    public Mage() {
        specialSkill.setName("Fire Storm");
        specialSkill.setCooldown(120);
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
        return super.toString() + specialSkill.toString() + "\nMana: " + this.getMana(); //To change body of generated methods, choose Tools | Templates.
    }

}

class Necromancer extends CharacterType {

    private int lifeForce;

    public Necromancer() {
        specialSkill.setName("Death Magic");
        specialSkill.setCooldown(60);
        super.setName("Necromancer Char");
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
        return super.toString() + specialSkill.toString() + "\nLife Force: " + this.getLifeForce(); //To change body of generated methods, choose Tools | Templates.
    }
}

