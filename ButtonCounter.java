package lab1;
/**
 * This class models a tally button counter.
 * It allows the user to increment, reset, and undo
 * the counter value without letting it drop below zero.
 */
public class ButtonCounter {

	    /** Stores the current value of the counter */
	    private int value;

	    /**
	     * Gets the current value of the counter.
	     *
	     * @return the current counter value
	     */
	    public int getValue()
	    {
	        return value;
	    }

	    /**
	     * Increments the current value of the counter by one.
	     */
	    public void click()
	    {
	        value++;
	    }

	    /**
	     * Resets the counter value to zero.
	     */
	    public void reset()
	    {
	        value = 0;
	    }

	    /**
	     * Undoes a click by decrementing the counter value by one.
	     * The value will not be allowed to go below zero.
	     */
	    public void undo()
	    {
	        if (value > 0)
	        {
	            value--;
	        }
	    }
	}