/*
 * @author bhargav.bechara@stltech.in
 * @date 03-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description File reading
 */
package com.sterlite.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadByteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("welcome.txt");
			
			int data = 0;
			
			while( (data = fis.read())!=-1) {
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(fis!=null) {
					fis.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
