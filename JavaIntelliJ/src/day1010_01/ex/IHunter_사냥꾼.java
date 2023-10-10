
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface IHunter_사냥꾼 {



    /**
     * @param basichealth
     */
    public void wake(int basichealth);

    /**
     * @param speed
     */
    public void walk(int speed);

    /**
     * @param speed
     */
    public void run(int speed);

    /**
     * @param attackpower
     */
    public void attack(int attackpower);

    /**
     * @param defencepower
     */
    public void defence(int defencepower);

    /**
     * @param basichealth
     */
    public void sleep(int basichealth);

    /**
     * 
     */
    public void dead();

}