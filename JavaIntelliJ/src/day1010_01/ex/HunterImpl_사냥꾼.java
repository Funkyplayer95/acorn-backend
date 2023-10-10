
import java.io.*;
import java.util.*;

/**
 * 
 */
public class HunterImpl_사냥꾼 implements IHunter_사냥꾼 {

    /**
     * Default constructor
     */
    public HunterImpl_사냥꾼() {
    }

    /**
     * 
     */
    private int health;

    /**
     * 
     */
    private int attackpower;

    /**
     * 
     */
    private int defencepower;

    /**
     * 
     */
    private int cash;

    /**
     * 
     */
    private int speed;

    /**
     * 
     */
    public Location location;



    /**
     * @return
     */
    public Location location() {
        // TODO implement here
        return null;
    }

    /**
     * @param basichealth
     */
    public void wake(int basichealth) {
        // TODO implement IHunter_사냥꾼.wake() here
    }

    /**
     * @param speed
     */
    public void walk(int speed) {
        // TODO implement IHunter_사냥꾼.walk() here
    }

    /**
     * @param speed
     */
    public void run(int speed) {
        // TODO implement IHunter_사냥꾼.run() here
    }

    /**
     * @param attackpower
     */
    public void attack(int attackpower) {
        // TODO implement IHunter_사냥꾼.attack() here
    }

    /**
     * @param defencepower
     */
    public void defence(int defencepower) {
        // TODO implement IHunter_사냥꾼.defence() here
    }

    /**
     * @param basichealth
     */
    public void sleep(int basichealth) {
        // TODO implement IHunter_사냥꾼.sleep() here
    }

    /**
     * 
     */
    public void dead() {
        // TODO implement IHunter_사냥꾼.dead() here
    }

}