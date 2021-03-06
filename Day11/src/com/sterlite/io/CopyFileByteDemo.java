/*
 * @author bhargav.bechara@stltech.in
 * @date 03-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description File reading and writing operation
 */
package com.sterlite.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileByteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		FileInputStream fis = null;
//		FileOutputStream fos = null;
		
		try(
				//try-with-resource statements 
				FileInputStream fis = new FileInputStream("welcome.txt"); // read mode
				//fos = new FileOutputStream("copy.txt"); // write mode/append
				FileOutputStream fos = new FileOutputStream("copy.txt",true);	
			)
		{
			
			int data = 0;
			while((data=fis.read()) != -1 ) {
				fos.write(data);
			}
			
			System.out.println("Filed copied successfully!");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			
//			try {
//				if(fis != null)
//					fis.close();
//				if(fos!=null)
//					fos.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		
	}

}
