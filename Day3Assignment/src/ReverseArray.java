import electronic.*;
import electronic.mobile.*;
/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstration of reverse and package access
 */
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,4,8,9};
		for(int i = a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
		Computer c = new Computer();
		c.showDetalis();
		
		Robot r = new Robot();
		r.works();
		
		//electronic.mobile.SmartPhone ph = new electronic.mobile.SmartPhone();
		SmartPhone ph= new SmartPhone();
		ph.makeCall();
	}

}
