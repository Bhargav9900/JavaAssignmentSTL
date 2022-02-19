/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description VarArg Demo
 */
public class VarArgDemo {

	public static double average(int x,int ...a) {
		int len = a.length;
		double sum= 0.0;
		for(double ele:a) {
			sum+=ele;
		}
		System.out.println(sum);
		return (sum+x)/(len+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg = average(50,10,20,30,40);
		System.out.println(avg);
	}

}
