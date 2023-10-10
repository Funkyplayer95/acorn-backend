
import java.io.*;
import java.util.*;

/**
 * 
 */
public interface IPrey_사냥감 {


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
     * 
     */
    public void dead();

}