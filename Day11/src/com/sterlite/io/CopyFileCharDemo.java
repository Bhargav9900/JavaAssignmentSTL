/*
 * @author bhargav.bechara@stltech.in
 * @date 03-02-2021
 * @version 1.0
 * @copyright Sterlite Technologies Ltd. All rights reserved.
 * @description File reading and writing operation using character string
 */
package com.sterlite.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CopyFileCharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(
			
				FileReader fr = new FileReader("welcome.txt");
				FileWriter fw = new FileWriter("copy5.txt");
				
				BufferedReader br = new BufferedReader(fr);
				BufferedWriter bw = new BufferedWriter(fw);
				
				PrintWriter pw = new PrintWriter(bw);
			)
		{
		
//			int data = 0;
//			while( (data=fr.read()) != -1)// char by char copying data
//				fw.write(data);
			
			String line = null;
			while( (line=br.readLine())!=null){
//				bw.write(line);//line by line
//				bw.newLine();
				
				pw.println(line);
			}
			
			System.out.println("File copied");
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
