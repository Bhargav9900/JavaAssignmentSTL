/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstration of vararg
 */
public class VarArgDemo {

	public static int sum(int x,int ...v) {
		System.out.println("Size of var-arg: "+v.length);
		int tot=0;
		for(int i=0;i<v.length;i++) {
			tot+=v[i];
		}
		
		return tot;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = sum(8000);
		System.out.println(total);
		total= sum(10,20,30,60,50,30);
		System.out.println(total);
		total= sum(-400,67,780);
		System.out.println(total);
	}

}
