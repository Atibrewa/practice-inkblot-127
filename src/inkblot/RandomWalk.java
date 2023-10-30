package inkblot;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rand;
    private int currentWalkValue;
    private double min;
    private double max;

    /**
     * Creates a new random walk starting with some initial value.
     */
    public RandomWalk(int value,double min, double max) {
        rand = new Random();
        currentWalkValue = value;
        this.min=min;
        this.max=max;
    }

    public int getValue() {
        return currentWalkValue;
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     * @return Updated value.
     */
    public int advanceValue() {
        if(rand.nextBoolean()&&currentWalkValue<max){
            currentWalkValue+=1;
        }else if(currentWalkValue>min){
            currentWalkValue-=1;
        }
        return getValue();
    }
}

