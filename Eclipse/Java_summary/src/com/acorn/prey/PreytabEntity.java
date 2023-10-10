package com.acorn.prey;

public class PreytabEntity {
    public int health;
    public int attackpower;
    public int defencepower;
    public int x;
    public int y;
    public String type;

    public PreytabEntity () {}

    public PreytabEntity(int health, int attackpower, int defencepower, int x, int y, String type) {
        this.health = health;
        this.attackpower = attackpower;
        this.defencepower = defencepower;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackpower() {
        return attackpower;
    }

    public void setAttackpower(int attackpower) {
        this.attackpower = attackpower;
    }

    public int getDefencepower() {
        return defencepower;
    }

    public void setDefencepower(int defencepower) {
        this.defencepower = defencepower;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
