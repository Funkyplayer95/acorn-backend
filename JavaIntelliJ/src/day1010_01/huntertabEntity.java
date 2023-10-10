package day1010_01;

public class huntertabEntity {
    public int health;
    public int attackpower;
    public int defencepower;
    public int cash;
    public int x;
    public int y;
    public String type;

    public huntertabEntity() {}

    public huntertabEntity(int helth, int attackpower, int defencepower, int cash, int x, int y, String type) {
        this.health = health;
        this.attackpower = attackpower;
        this.defencepower = defencepower;
        this.cash = cash;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public int getHelth() {
        return health;
    }

    public void setHelth(int helth) {
        this.health = helth;
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

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
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
