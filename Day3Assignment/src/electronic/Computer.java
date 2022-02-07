//Syntax: package package-name
package electronic;
/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstration of package
 */
public class Computer {

	private int noOfScreens;
	
	public Computer(){
		noOfScreens = 1;
	}
	
	public void showDetalis() {
		System.out.println("No of screens= "+noOfScreens);
	}
}
