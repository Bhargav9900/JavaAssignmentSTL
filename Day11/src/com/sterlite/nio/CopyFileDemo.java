package com.sterlite.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CopyFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Path filePath = FileSystems.getDefault().getPath("welcome.txt");
			List<String> lines = Files.readAllLines(filePath);
			lines.forEach(line-> System.out.println(line));
			
			Path desiFilePath = FileSystems.getDefault().getPath("copynio.txt");
			
			Files.copy(filePath, desiFilePath);
			System.out.println("Successfully copied");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
