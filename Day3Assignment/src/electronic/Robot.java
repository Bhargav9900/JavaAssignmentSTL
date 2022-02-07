package electronic;
/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstration of package
 */
public class Robot {

	// Containment
	Computer c;
	
	public Robot() {
		c = new Computer();
	}
	
	public void works() {
		c.showDetalis();
	}
}
