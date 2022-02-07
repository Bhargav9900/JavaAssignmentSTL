/*
 * @author bhargav.bechara@stltech.in
 * @date 20-01-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description demonstration of array
 */
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[];
		arr = new int[5];
		int arr2[]= {1,2,3,4,5};
		int sum=0;
		
		System.out.println("Reverse array print");
		for(int i=arr2.length-1;i>=0;i--) {
			System.out.println(arr2[i]);
		}
		
		//ForEach
		for(int a:arr2) {
			sum+=a;
			//System.out.println(a);
		}
		System.out.println("sum="+sum);
		arr[0]=99;
		arr[4]=16;
		arr[2]=11;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("2D array");
		//2D array
		int [][]arr2d = new int[3][4];
		arr2d[2][0]=11;
		arr2d[1][2]=16;
		arr2d[0][1]=9;
		arr2d[0][3]=9;
		
		for(int i=0;i<arr2d.length;i++) {
			for(int j=0; j<arr2d[i].length;j++) {
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("2D array using ForEach loop");
		
		for (int[] u: arr2d) {
		    for (int elem: u) {
		        System.out.print(elem+ " ");
		    }
		    System.out.println();
		}
		
		//array of object
		MyDate dArr[] = new MyDate[2];
		dArr[0] = new MyDate();
		dArr[1] = new MyDate(3,12,2006);
		
		for(int i=0;i<dArr.length;i++) {
			System.out.println(dArr[i]);
		}
		
		System.out.println();
		System.out.println("For each array object of class");
		for(MyDate d: dArr) {
			System.out.println(d);
		}
		
		
	}

}
