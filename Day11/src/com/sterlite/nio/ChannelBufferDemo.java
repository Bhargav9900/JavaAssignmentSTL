package com.sterlite.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ChannelBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Path filePath = FileSystems.getDefault().getPath("welcome.txt");

			// creating channel connected to a file in read mode
			FileChannel fileChannel = FileChannel.open(filePath, StandardOpenOption.READ);

			// creating byte buffer of capacity 10
			ByteBuffer byteBuffer = ByteBuffer.allocate(10);

			System.out.println("\nAfter buffer creation:::");
			System.out.println("Capacity of buffer: " + byteBuffer.capacity());
			System.out.println("limit of buffer: " + byteBuffer.limit());
			System.out.println("current position of buffer: " + byteBuffer.position());

			// reading data from channel and writing data to buffer
			int bytesRead = fileChannel.read(byteBuffer);
			System.out.println("\nAfter writing first set of data to buffer:::");
			// System.out.println("Capacity of buffer: "+byteBuffer.capacity());
			System.out.println("current position of buffer: " + byteBuffer.position());
			System.out.println("limit of buffer: " + byteBuffer.limit());

			while (bytesRead!=-1) {

				// switching buffer operation from write to read
				byteBuffer.flip();
				System.out.println("\nAfter flipping:::");
				System.out.println("current position of buffer: " + byteBuffer.position());
				System.out.println("limit of buffer: " + byteBuffer.limit());

				// reading data from buffer

				while (byteBuffer.hasRemaining()) {
					int data = byteBuffer.get();
					System.out.print((char) data); // sending data to destination
				}

				System.out.println("\nAfter reading from buffer:::");
				System.out.println("current position of buffer: " + byteBuffer.position());
				System.out.println("limit of buffer: " + byteBuffer.limit());

				// clearing the buffer
				byteBuffer.clear();
				System.out.println("\nAfter clearing buffer:::");
				System.out.println("current position of buffer: " + byteBuffer.position());
				System.out.println("limit of buffer: " + byteBuffer.limit());

				// Again reading from channel and writing data to the buffer
				bytesRead = fileChannel.read(byteBuffer);
				System.out.println("\nAfter writing next set of data from buffer:::");
				System.out.println("current position of buffer: " + byteBuffer.position());
				System.out.println("limit of buffer: " + byteBuffer.limit());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
