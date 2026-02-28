package lab1;
/** 
 * This class tests the ButtonCounter class.
 * It confirms that clicking and undoing the counter 
 * produces the expected results.
 */
public class ButtonCounterTester {
	/**
     * The main method runs test cases for the ButtonCounter class. 
     */
	public static void main(String[] args) {
		    
		    {
		        ButtonCounter tally = new ButtonCounter();

		        tally.click();
		        tally.click();
		        tally.click();
		        System.out.println(tally.getValue());
		        System.out.println("Expected: 3");

		        tally.undo();
		        System.out.println(tally.getValue());
		        System.out.println("Expected: 2");

		        tally.undo();
		        tally.undo();
		        tally.undo();
		        System.out.println(tally.getValue());
		        System.out.println("Expected: 0");
		    }
		}
}

