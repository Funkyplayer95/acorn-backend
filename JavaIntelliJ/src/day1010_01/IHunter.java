package day1010_01;

public interface IHunter {
    public void wake (int basichealth);
    public void walk (int speed);
    public void run (int speed);
    public void attack (int attackpower);
    public void defence (int defencepower);
    public void sleep (int basichealth);
    public void dead ();
}
