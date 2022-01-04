package com.company;

public class Entity {
    private String name;
    private String role;
    private double hp;
    private double dmg;
    private double armor;
    private double critChance;
    private boolean dead = false;

    public Entity(String name, String role, double hp, double dmg, double armor, double critChance) {

        this.name = name;
        this.role = role;
        this.hp = hp;
        this.dmg = dmg;
        this.armor = armor;
        this.critChance = critChance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setDmg(double dmg) {
        this.dmg = dmg;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return this.role;
    }

    public double getHp() {
        return this.hp;
    }

    public double getDmg() {
        return this.dmg;
    }

    public double getArmor() {
        return this.armor;
    }

    public double getCritChance() {
        return this.critChance;
    }

    public String toString() {
        return this.name + ":\nhp=" + this.hp + "\ndmg=" + this.dmg + "\narmor=" + this.armor + "\ncrit=" + this.critChance + "\n";
    }
}

