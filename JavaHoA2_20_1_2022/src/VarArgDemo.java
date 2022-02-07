/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description VarArg Demo
 */
public class VarArgDemo {

	public static double average(int ...a) {
		int len = a.length;
		double sum= 0.0;
		for(double ele:a) {
			sum+=ele;
		}
		return sum/len;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg = average(10,20,30,40);
		System.out.println(avg);
	}

}
