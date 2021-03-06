/*
 * @author bhargav.bechara@stltech.in
 * @date 03-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Represent user-defined thread class
 */
package com.sterlite.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		
		try {
			File file = new File("hello.txt");
			System.out.println("File created: " + file.createNewFile());
			
			File anotherFile = new File("welcome.txt");
			System.out.println("File " + file.getName() + 
					" is renamed to " + anotherFile.getName() + 
					": " + file.renameTo(anotherFile));
			
			System.out.println("File " + file.getName() +
								"delete " + file.delete());
			
			File dir = new File("myDir");
			System.out.println("Directory created: " + dir.mkdir());
			
			File dirFile = new File(dir,"hi.txt");
			System.out.println("File " + dirFile.getName() + 
					   			" created in directory: " +
								dir.getName() + ": " + dirFile.createNewFile());
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
