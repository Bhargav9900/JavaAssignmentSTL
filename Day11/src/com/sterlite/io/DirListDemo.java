/*
 * @author bhargav.bechara@stltech.in
 * @date 03-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description Directory Listing
 */
package com.sterlite.io;

import java.io.File;

public class DirListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("/home/sterlite/JavaSoftware");
		String[] filesOrSubDirs = dir.list();
		for(String fileorsub : filesOrSubDirs) {
			System.out.println(fileorsub);
		}
	}

}
