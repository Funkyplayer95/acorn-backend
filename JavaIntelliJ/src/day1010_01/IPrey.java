package day1010_01;

public interface IPrey {
    public void walk(int speed);
    public void run(int speed);
    public void attack(int attackpower);
    public void defence(int defencepower);
    public void dead();
}